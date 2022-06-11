package com.linkedList;

public class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next =null;
    }

    Node (){}

    Node (int data, Node next){
        this.data = data;
        this.next = next;
    }

    // Basic opertation

    public static void printLinkedList(Node node){
        System.out.println();
        while ( node != null){
            System.out.print(node.data + " ");
        }
        System.out.println();
    }

    public static Node getRandomLinkedlist(){
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);

        return head;
    }



}
