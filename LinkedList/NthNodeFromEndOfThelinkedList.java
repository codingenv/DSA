package com.linkedList;

public class NthNodeFromEndOfThelinkedList {
    public static void main(String args[]){
        Node head = Node.getSequentialLinkedlist3();
        printNthNode(head, 5);
    }

    public static void printNthNode (Node head, int n){
        Node temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        if(n > length ){
            return;
        }

        temp = head;
        int i = 0;
        while(i< length - n){
            temp = temp.next;
            i++;
        }
        System.out.println(temp.data);
    }
}
