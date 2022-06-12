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
        System.out.println("Printing given linked list");
        while ( node != null){
            System.out.print(node.data + " ");
            node = node.next;
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

    public static Node addAtBeginingofListList(Node head, int data){
        if(head == null){
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public static Node addAtEndOfLinkedList(Node head, int data){
        if(head == null){
            head = new Node(data);
            return head;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
            return head;
        }
    }



}
