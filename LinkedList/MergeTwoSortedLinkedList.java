package com.linkedList;

/*
Merge two sorted linked list

 */
public class MergeTwoSortedLinkedList {
    public static void main(String args[]){
        Node head1 = Node.getRandomLinkedlist();
        Node head2 = Node.getRandomLinkedlist2();

        Node mergedHead = recursivlyMergedHead(head1, head2);
        Node.printLinkedList(mergedHead);
    }

    public static Node recursivlyMergedHead(Node head1, Node head2){
        if(head1 == null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

        if(head1.data < head2.data){
            head1.next = recursivlyMergedHead(head1.next, head2);
            return head1;
        }else{
            head2.next = recursivlyMergedHead(head1, head2.next);
            return head2;
        }
    }
}
