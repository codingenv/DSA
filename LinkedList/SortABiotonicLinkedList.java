package LinkedList;

public class SortABiotonicLinkedList {
    public static void main(String args[]){
        int arr [] = {2,5,7,12,10,6,4,1};
        DNode head = DNode.convertArrayToDList(arr);
        DNode.printList(head);
        System.out.println("After sorting");
        DNode.printList(convert(head));

    }

    public static DNode convert(DNode head){
        DNode head1 = head;
        if(head == null || head.next == null){
            return head;
        }
        DNode head2 = null;
        while(head1.next != null){
            if(head1.next.data < head1.data){
                head2 = head1.next;
                head1.next.prev = null;
                head1.next = null;
                break;
            }
            head1 = head1.next;
        }

        //Reset the head1 back to head.
        head1 = head;
        // reverse the head2 linked list.
        head2 = ReverseADList.reverseADListIterative(head2);

        // merge the head1 and head2
        return   MergeTwoSortedDLinkedList.mergeDList(head1, head2);
    }
}
