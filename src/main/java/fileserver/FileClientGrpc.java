package fileserver;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CountDownLatch;

import com.google.protobuf.ByteString;
//import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import com.rew.grpc.JoinSyndicateGrpc;
//import com.rew.grpc.JoinSyndicateGrpc.JoinSyndicateBlockingStub;
import com.rew.grpc.JoinSyndicateGrpc.JoinSyndicateStub;
import com.rew.grpc.Syndicate.FileData;
import com.rew.grpc.Syndicate.FileRes;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class FileClientGrpc {

	public static void main(String [] args) {
		try {
	ManagedChannel channel=ManagedChannelBuilder.forAddress("172.25.192.1", 3000).usePlaintext().build();
	JoinSyndicateStub joinsynstub=JoinSyndicateGrpc.newStub(channel);
	CountDownLatch latch = new CountDownLatch(1);
	StreamObserver<FileData> streamobs = joinsynstub.sendfile(new FileUploadObserver(latch));
	Path path = Paths.get("src/test/resources/input/testhehe.txt");
	 InputStream inputStream = Files.newInputStream(path);
	    byte[] bytes = new byte[4096];
	    int size1;
    	 while((size1 = inputStream.read(bytes))> 0){
         FileData uploadRequest = FileData.newBuilder().setData(ByteString.copyFrom(bytes, 0 , size1)).setSize(1).build();
         streamobs.onNext(uploadRequest);
     }
     inputStream.close();
     streamobs.onCompleted();
     latch.await();
	}
		catch(Exception e) {
			System.out.println("Error in client ");
		}
	}
	
}

 class FileUploadObserver implements StreamObserver<FileRes> {

    private final CountDownLatch latch;
    public FileUploadObserver(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void onNext(FileRes fileUploadResponse) {
        System.out.println(
                "File upload status :: " + fileUploadResponse.getAck()
        );
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onCompleted() {
        System.out.println("Done");
        this.latch.countDown();
    }
}


