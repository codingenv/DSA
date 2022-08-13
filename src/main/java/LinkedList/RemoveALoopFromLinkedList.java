package LinkedList;

/*
    1->2->3->4->5->6
                |  |
                8<-7
    Here 8 is pointing to 5 instead of null.
    We have to make node 8 to pint to null.

    Expected output:
    1->2->3->4->5->6->7->8
 */

public class RemoveALoopFromLinkedList {
    public static void main(String args[]) {
        Node head = Node.getLinkedListWithLoop();
        System.out.println(detectAndRemoveLoop(head));
        Node.printLinkedList(head);
    }

    static int detectAndRemoveLoop(Node head){
        if(head == null || head.next == null){
            return  1;
        }

        Node slowPtr = head;
        Node fastPtr = head;

        while(slowPtr != null && fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(slowPtr == fastPtr){
                removeLoop(slowPtr);
                return 1;
            }
        }
        return 0; // If loop is not found.
    }

    static void removeLoop(Node loop){
        Node ptr1 = loop;
        Node ptr2 = loop;
        while(ptr1.next != ptr2){
            ptr1 = ptr1.next;
        }
        ptr1.next = null;
        return;
    }
}
