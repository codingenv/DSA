package com.practice.binary;

public class ListNode {
    int data;
    ListNode next;

    public ListNode(int data){
        this.data = data;
        this.next = null;
    }

    public ListNode (){}

    public static ListNode createRandomLinkedList(){
        ListNode obj = new ListNode(10);
        obj.next = new ListNode(12);
        obj.next.next = new ListNode(15);
        obj.next.next.next = new ListNode(25);
        obj.next.next.next.next = new ListNode(30);
        obj.next.next.next.next.next = new ListNode(36);
        return obj;
    }
}
