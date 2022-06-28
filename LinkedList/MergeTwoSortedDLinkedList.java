package com.linkedList;

public class MergeTwoSortedDLinkedList {
    public static void main(String args[]){
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6,8};

        DNode head1 = DNode.convertArrayToDList(arr1);
        DNode head2 = DNode.convertArrayToDList(arr2);

        DNode.printList(mergeDList(head1, head2));
    }

    public static DNode mergeDList(DNode head1, DNode head2){
        if(head1 == null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

        if(head1.data < head2.data){
            head1.next = mergeDList(head1.next, head2);
            head1.next.prev = head1;
            head1.prev = null;
            return head1;
        }else{
            head2.next = mergeDList(head1, head2.next);
            head2.next.prev = head2;
            head2.prev = null;
            return head2;
        }
    }
}
