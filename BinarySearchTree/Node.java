package com.binarysearchtree;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Recursive function to insert a given key into a BST
    public static Node insert(Node root, int key)
    {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        }
        else {
            root.right = insert(root.right, key);
        }

        return root;
    }
}
