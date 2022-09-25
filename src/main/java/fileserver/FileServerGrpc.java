package fileserver;
import java.io.IOException;
import java.io.OutputStream;
//import java.nio.file.Files;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.rew.grpc.JoinSyndicateGrpc.JoinSyndicateImplBase;
import com.rew.grpc.Syndicate.FileRes;
import com.rew.grpc.Syndicate.FileData;
import io.grpc.stub.StreamObserver;


public class FileServerGrpc extends JoinSyndicateImplBase{

	 private static final Path SERVER_BASE_PATH = Paths.get("src/test/resources/output");
	@Override
	public StreamObserver<FileData> sendfile(StreamObserver<FileRes> responseObserver) {
		
			try {
				return new StreamObserver<FileData>() {
					OutputStream writer =Files.newOutputStream(SERVER_BASE_PATH.resolve("hehe.txt"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					@Override
					public void onNext(FileData datareq) {
						try {
							System.out.println("here "+datareq.getData().toString());
//							writer.write(datareq.getData().toByteArray());
							byte [] b={'h', 'e', 'l', 'l', 'o'};
							writer.write(b);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							writer.flush();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					@Override
					public void onError(Throwable throwable) {
						System.out.println("Error hehe");
					}
					@Override
					public void onCompleted() {
						try {
							writer.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						FileRes response = FileRes.newBuilder().setAck("Done").build();
						responseObserver.onNext(response);
						responseObserver.onCompleted();
					}
				};
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		
}
	
	public static void main(String []  args) {
		Server server=ServerBuilder.forPort(3000).addService(new FileServerGrpc()).build();
		try {
			server.start();
			System.out.println("Server started at "+server.getPort());
			server.awaitTermination();
		}
		catch(Exception e) {
			System.out.println("exception "+e);
		}
	}
}