package com.linkedList;

/*
Reverse a linked list in gourp of given size.
Input:
1->2->3 -> 4->5->6 -> 7->8 -> Null;
Size =3
Output:
3->2->1->6->5->4->8->7->Null
 */

public class ReverseALinkedListInGroupOfGivenSize {

    public static void main(String args[]) {
        int[] arry = {1, 2, 3, 4, 5, 6, 7, 8};
        Node head = new Node(1);
        for(int i = 1; i< arry.length;i++){
            Node.addAtEndOfLinkedList(head, arry[i]);
        }
        Node.printLinkedList(head);
        int size = 3;
        Node newHead = reverseByGivenSize(head, size);
        Node.printLinkedList(newHead);

    }

    public static Node reverseByGivenSize(Node head, int size){
        if(head == null){
            return head;
        }

        int count  = 0;
        Node curr = head;
        Node next =null;
        Node prev =null;

        while(count < size && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if(next != null){
            head.next = reverseByGivenSize(next, size);
        }

        return prev;
    }

}
