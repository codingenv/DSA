package com.practice.binary;

/*
A complete binary tree can be represented in an array in
the following approach. If root node is stored at
index i, its left, and right children are stored at
indices 2*i+1, 2*i+2 respectively.
 */

import java.util.ArrayDeque;
import java.util.Queue;

public class BuildBinaryTreeFromLinkedList {

    public static Node convertListToBinaryTree(ListNode head){
        //base case
        if(head == null){
            return null;
        }

        Node root = new Node(head.data);
        head = head.next;

        // Create a queue to store the tree pointer and enqueue the root node.
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        // loop till the end of the linked list is reached.
        while(head != null){
            //dequeue from the front node
            Node front = q.poll();

            //Create a left child from the next node in the linked list and enqueue it.
            front.left = new Node(head.data);
            q.add(front.left);

            // move the head pointer to the next node
            head = head.next;

            // if the linked list is not reached its end
            if(head != null){
                //Create the right child from the next node and enqueue it.
                front.right = new Node(head.data);
                q.add(front.right);
                head = head.next;
            }
        }
        return root;
    }

    public static void main(String args[]){
        ListNode head = ListNode.createRandomLinkedList();
        Node root = convertListToBinaryTree(head);
        Node.inOrderTraversal(root);
    }
}
