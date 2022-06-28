package com.linkedList;

public class RemoveDuplicateFromSortedLinkedList {
    public static void main(String args[]){
        int []arr = {1,2,3,4,4,5,5,6,6,6,7,8,8,8,9};
        Node head = Node.convertArrayToLinkedList(arr);
        Node.printLinkedList(head);
        System.out.println("After removing duplicates");
        removeDuplicates(head);
        Node.printLinkedList(head);


        head = Node.convertArrayToLinkedList(arr);
        System.out.println("After removing duplicates recursively");
        removeDuplicatesRecursively(head);
        Node.printLinkedList(head);
    }

    public static void removeDuplicates(Node head){
        Node temp1 = head;
        while(temp1 != null){
            Node temp2 = temp1;
            while(temp2 != null && temp2.data == temp1.data){
                temp2 = temp2.next;
            }
            temp1.next = temp2;
            temp1 = temp1.next;
        }
    }

    public static Node removeDuplicatesRecursively(Node head){
        if(head == null){
            return head;
        }

        head.next = removeDuplicatesRecursively(head.next);
        if(head.next != null && head.next.data == head.data){
            Node res = head.next;
            return res;
        }
        return head;
    }
}
