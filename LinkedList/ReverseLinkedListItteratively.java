package com.linkedList;

public class ReverseLinkedListItteratively {
    public static void main(String args[]){
        Node head = Node.getRandomLinkedlist();
        Node.printLinkedList(head);
        head = reverseItteratively(head);
        Node.printLinkedList(head);

    }

    public static Node reverseItteratively(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node curr= head;
        Node prev = null;
        Node next = curr;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }
}
