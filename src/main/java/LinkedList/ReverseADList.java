package LinkedList;

public class ReverseADList {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        DNode head = DNode.convertArrayToDList(arr);
        DNode.printList(head);
        System.out.println("After Reversing");
        DNode.printList(reverseADListIterative(head));
    }

    public static DNode reverseADListIterative(DNode head){
        if(head == null){
            return head;
        }

        DNode last = head;
        DNode prev = null;
        while(last != null){
            DNode tempPtr = last.next;
            last.next = last.prev;
            last.prev = tempPtr;
            prev = last;
            last = last.prev;
        }
        return prev;
    }

}
