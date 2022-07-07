package LinkedList;

/*
Rotate a given linked list counterclockwise by k nodes.

Input:
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
K = 4
Output:
50 -> 60 -> 10 -> 20 -> 30 -> 40 -> null

 */
public class RotateByKNodes {
    public static void main(String args[]){
        Node head = Node.getRandomLinkedlist();
        int k = 4;
        Node.printLinkedList(head);
        head = rotateNodes(head, k);
        Node.printLinkedList(head);

    }

    public static Node rotateNodes(Node head, int k){
        if(head == null){
            return head;
        }

        Node temp = head;

        int counter = 0;
        Node prev = null;
        while(counter < k && temp != null){
            prev = temp;
            temp = temp.next;
            counter++;
        }

        if(temp == null && counter == k){
            return head;
        }

        Node newHead = temp;

        while(temp.next != null){
            temp = temp.next;
        }

        if(prev != null){
            prev.next = null;
        }

        temp.next = head;
        return newHead;

    }
}
