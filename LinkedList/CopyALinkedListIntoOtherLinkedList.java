package LinkedList;

public class CopyALinkedListIntoOtherLinkedList {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
        Node head = Node.convertArrayToLinkedList(arr);

        Node.printLinkedList(copyList(head));
        Node.printLinkedList(copyListRecursive(head));

    }

    public static Node copyList(Node head)
    {
        Node current = head;
        Node newList = null;
        Node tail = null;

        while (current != null)
        {
            if (newList == null)
            {
                newList = new Node(current.data, null);
                tail = newList;
            }
            else {
                tail.next = new Node(current.data, null);
                tail = tail.next;
            }
            current = current.next;
        }

        return newList;
    }

    public static Node copyListRecursive(Node head)
    {
        if (head == null) {
            return null;
        }
        Node newNode = new Node(head.data);
        newNode.next = copyListRecursive(head.next);
        return newNode;
    }
}
