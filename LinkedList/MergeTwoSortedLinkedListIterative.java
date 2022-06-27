package com.linkedList;

public class MergeTwoSortedLinkedListIterative {
    public static void main(String args[]){
        Node head1 = Node.getRandomLinkedlist();
        Node head2 = Node.getRandomLinkedlist2();

        Node mergedHead = iterativeMergedHead(head1, head2);
        Node.printLinkedList(mergedHead);
    }

    public static Node iterativeMergedHead(Node head1, Node head2){
        Node dummyNode = new Node(0);
        Node tail = dummyNode;

        while(true){
            if(head1 == null){
                tail.next = head2;
                break;
            }

            if(head2 == null){
                tail.next = head1;
                break;
            }

            if(head1.data < head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }
        return dummyNode.next;
    }
}
