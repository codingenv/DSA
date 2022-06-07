package com.practice.binary;

/*
A complete binary tree can be represented in an array in
the following approach. If root node is stored at
index i, its left, and right children are stored at
indices 2*i+1, 2*i+2 respectively.
 */

import java.util.ArrayDeque;
import java.util.Queue;

public class BuildBinaryTreeFromArray {

    public static Node convertListToBinaryTree(int [] arr, int i){
        Node root = null;
        if(i < arr.length) {
            root = new Node(arr[i]);
            // insert the left child
            root.left = convertListToBinaryTree(arr, 2*i + 1);
            // insert the right child
            root.right = convertListToBinaryTree(arr, 2*i + 2);
        }
        return root;
    }

    public static void main(String args[]){
        int [] arr = {10,12,15,25,30,36};
        Node root = convertListToBinaryTree(arr, 0);
        Node.inOrderTraversal(root);
    }
}
