package com.example.studifyjava.db;

import com.example.studifyjava.datamodels.Node;

public class AVLTree {
    Node root;
    public Node insert(Node root,Node node){
        if(root==null){

            if(this.root==null){
                this.root=node;
            }
            return node;
        }

        if(node.id<root.id){
            root.left=insert(root.left, node);
        }else if(node.id>root.id){
            root.right=insert(root.right, node);
        }else{
            return node;
        }
        root.height=1+Integer.max(getHeight(root.left),getHeight(root.right));
        int balance=getHeight(root.left)-getHeight(root.right);
        if(balance<-1 && root.right.id<node.id){
            return leftShift(root);
        }
        if(balance<-1 && root.right.id>node.id){
            root.right=rightShift(root.right);
            return leftShift(root);
        }
        if(balance>1 && root.left.id<node.id){
           return rightShift(root);
        }
        if(balance>1 && root.left.id>node.id){
            root.left=leftShift(root.left);
            return rightShift(root);
        }
        return root;

    }
    private Node leftShift(Node x){
        Node y=x.right;
        Node t2=y.left;
        y.left=x;
        x.right=t2;
        x.height=1+Integer.max(getHeight(x.left),getHeight(x.right));
        y.height=1+Integer.max(getHeight(y.left),getHeight(y.right));
        return y;
    }
    private Node rightShift(Node x){
        Node y=x.left;
        Node t2=y.right;
        y.right=x;
        x.left=t2;
        x.height=1+Integer.max(getHeight(x.left),getHeight(x.right));
        y.height=1+Integer.max(getHeight(y.left),getHeight(y.right));
        return y;
    }
    private int getHeight(Node node){
        if(node==null){
            return 0;
        }
        return node.height;
    }

}
