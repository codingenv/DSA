package LinkedList;

/*
Approach:
Using difference of the node count
1. Get the count of the node first list -> C1
2. Get the count of the node second list -> C1
3. Get the difference diff (c1-2). Absolute difference
4. Traverse the bigger node from head till diff nodes.
5. Traverse both the nodes in parallel there after we
come across the common nodes.


 */



public class FindIntersectionPoint {
    public static void main(String args[]){
        Node [] arr = Node.getIntersectLinkedList();
        System.out.println(getNode(arr[0], arr[1]));
    }

    static int getNodeCount(Node head){
        if(head == null){
            return 0;
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp  = temp.next;
            count++;
        }
        return count;
    }

    static int getNode(Node head1, Node head2){
        int c1= getNodeCount(head1);
        int c2 = getNodeCount(head2);
        int d = 0;

        if(c1> c2){
            d = c1 - c2;
            return getIntersectionNode(d, head1, head2);

        }else{
            d = c2 - c1;
            return getIntersectionNode(d, head2, head1);
        }
    }

    static int getIntersectionNode(int diff, Node head1, Node head2){
        Node current1 = head1;
        Node current2 = head2;
        int count = 0;

        while(count < diff){
            current1 = current1.next;
            count++;
        }

        while(current1 != null && current2 != null){
            if(current1.data == current2.data){
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return -1;
    }
}
