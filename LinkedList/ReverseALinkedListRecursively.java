    package LinkedList;

public class ReverseALinkedListRecursively {

    public static void main(String args[]){
        Node head = Node.getRandomLinkedlist();
        Node.printLinkedList(head);
        head = reverseRecurively(head);
        Node.printLinkedList(head);

    }

    public static  Node reverseRecurively(Node head){
        if(head == null){
            return head;
        }

        if(head.next == null)
        {
            return head;
        }

        Node tempHeadNode = reverseRecurively(head.next);

        head.next.next = head;
        head.next = null;

        return tempHeadNode;
    }


}
