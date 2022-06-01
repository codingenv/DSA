package com.practice.binary.tree;

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
}
