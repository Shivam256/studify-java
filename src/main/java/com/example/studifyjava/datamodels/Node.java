package com.example.studifyjava.datamodels;

import java.io.Serializable;

public class Node implements Serializable {
    public int id;
    public int height;
    public Node left;
    public Node right;

    public int maxId;

    Node(int _id){

        this.id=_id;
        this.height=1;
    }





}
