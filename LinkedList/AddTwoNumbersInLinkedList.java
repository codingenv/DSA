package LinkedList;

import java.sql.PreparedStatement;

public class AddTwoNumbersInLinkedList {

    public static void main(String [] args){
        int arr1[] = {5,6,3};
        int arr2[] = {8,4,2};

        Node head1 = Node.convertArrayToLinkedList(arr1);
        Node head2 = Node.convertArrayToLinkedList(arr2);

        Node.printLinkedList(head1);
        Node.printLinkedList(head2);

        Node.printLinkedList(addTwoList(head1, head2));
    }

    static Node addTwoList(Node head1, Node head2){
        Node start1 = new Node(0);
        start1.next = head1;
        Node start2 = new Node(0);
        start2.next = head2;

        addPreceedingZero(start1, start2);

        Node result = new Node(0);

        if(sumTwoNodes(start1.next, start2.next, result) == 1){
            Node node = new Node(1);
            node.next = result.next;
            result.next = node;
        }
        return result.next;
    }

    static int sumTwoNodes(Node first, Node second, Node result){
        if(first == null){
            return 0;
        }

        int number = first.data + second.data + sumTwoNodes(first.next , second.next, result);

        Node node = new Node(number%10);
        node.next = result.next;
        result.next = node;
        return (number/10);
    }

    public static void addPreceedingZero(Node head1, Node head2){
        Node next1 = head1.next;
        Node next2 = head2.next;

        while(next1 != null && next2 != null){
            next1 = next1.next;
            next2 = next2.next;
        }

        if(next1 == null && next2 != null){
            while(next2 != null){
                Node node = new Node(0);
                node.next = head1.next;
                head1.next = node;
                next2 = next2.next;
            }
        }else if(next1 != null && next2 == null)
        {
            while(next1 != null){
                Node node = new Node(0);
                node.next = head2.next;
                head2.next = node;
                next1 = next1.next;
            }
        }
    }

}
