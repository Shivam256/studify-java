package com.example.studifyjava.db;

import com.example.studifyjava.datamodels.Course;
import com.example.studifyjava.datamodels.Node;

import java.io.*;
import java.util.ArrayList;

public class AVLTree {
    public Node root;
    public int maxId = 0;

    public ArrayList<Course> courses = new ArrayList<>();

    public Node insert(Node root, Node node) {
        if (root == null) {

            if (this.root == null) {
                this.root = node;
            }
            maxId = Integer.max(maxId,node.id);
            this.root.maxId = maxId;
            return node;
        }


        if (node.id < root.id) {
            root.left = insert(root.left, node);
        } else if (node.id > root.id) {
            root.right = insert(root.right, node);
        } else {
            return node;
        }
        root.height = 1 + Integer.max(getHeight(root.left), getHeight(root.right));
        int balance = getHeight(root.left) - getHeight(root.right);
        if (balance < -1 && root.right.id < node.id) {
            return leftShift(root);
        }
        if (balance < -1 && root.right.id > node.id) {
            root.right = rightShift(root.right);
            return leftShift(root);
        }
        if (balance > 1 && root.left.id < node.id) {
            return rightShift(root);
        }
        if (balance > 1 && root.left.id > node.id) {
            root.left = leftShift(root.left);
            return rightShift(root);
        }
        return root;

    }

    private Node leftShift(Node x) {
        Node y = x.right;
        Node t2 = y.left;
        y.left = x;
        x.right = t2;
        x.height = 1 + Integer.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Integer.max(getHeight(y.left), getHeight(y.right));
        return y;
    }

    private Node rightShift(Node x) {
        Node y = x.left;
        Node t2 = y.right;
        y.right = x;
        x.left = t2;
        x.height = 1 + Integer.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Integer.max(getHeight(y.left), getHeight(y.right));
        return y;
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public void serializeData(Node root,String filename) {
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(root);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Node decerializeData(String filename) {
        Node root = null;
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            root = (Node)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
        } catch (Exception ex) {
            System.out.println("IOException is caught");
        }
        return root;
    }

    public void printCourseTree(Course root){
        if(root == null) return;
        System.out.println(root.getCourseName());
        System.out.println(root.id);
        System.out.println(root.getCourseDescription());
        System.out.println(root.height);
        System.out.println();
        printCourseTree((Course)root.left);
        printCourseTree((Course)root.right);
    }

    public void getCourses(Course root){
        if(root == null) return;
        courses.add(root);
        getCourses((Course)root.left);
        getCourses((Course)root.right);
    }






}
