package com.practice.binary;


<<<<<<< HEAD
/*
Tree
            10
        /         \
     12              15
    /   \           /
 25       30     36

 Doubly Linked List:
25, 12, 30, 10, 36, 15


 */





public class BinaryTreeToDoublyLinkedList {
    Node root = Node.getBinaryTree();
    Node head;

    /*
     Initialize previously visited node as NULL. This is
     static so that the same value is accessible in all recursive
     calls
     */
    static Node prev = null;


    /*
    The idea is to do in order traversal of the binary tree.
    While doing inorder traversal, keep track of the previously
    visited node in a variable, say prev. For every visited node,
    make it next to the prev and previous of this node as prev.
     */

    public static void main(String [] args){
        BinaryTreeToDoublyLinkedList obj = new BinaryTreeToDoublyLinkedList();

        obj.binaryTreeToDoublyLinkedList(obj.root);

        obj.printdoublyLinkedList(obj.head);
    }

    public void binaryTreeToDoublyLinkedList(Node root){
        if(root == null){
            return;
        }

        binaryTreeToDoublyLinkedList(root.left);

        if(prev == null)
        {
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        binaryTreeToDoublyLinkedList(root.right);
    }

    void printdoublyLinkedList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
}
