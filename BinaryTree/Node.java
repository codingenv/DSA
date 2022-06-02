package com.practice.binary;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int item)
    {
        data = item;
        left = null;
        right = null;
    }
    public Node(){}


    public Node getRandomCreatedTree(){
        Node root = new Node(5);
        root.left = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(9);
        root.right = new Node(7);

        return root;
    }

    public Node getRandomCreatedTree2(){
        Node root = new Node(5);
        root.left = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(23);
        root.right = new Node(7);

        return root;
    }

    public static Node getBinaryTree(){
        Node tree = new Node();
        tree = new Node(10);
        tree.left = new Node(12);
        tree.right = new Node(15);
        tree.left.left = new Node(25);
        tree.left.right = new Node(30);
        tree.right.left = new Node(36);
        return tree;
    }
}
