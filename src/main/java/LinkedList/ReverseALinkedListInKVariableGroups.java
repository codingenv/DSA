package LinkedList;

/*
Reverse a linked list in gourp of given size.
Input:
1->2->3 -> 4->5->6 -> 7->8 -> Null;
Size =3
Output:
3->2->1->6->5->4->8->7->Null
 */

public class ReverseALinkedListInKVariableGroups {

    public static void main(String args[]) {
        //int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        //int size = 3;
        //int[] b = {2,3,4};

        /*int[] arry = {1,2,3,4,5};
        int size = 1;
        int[] b = {0};*/

        int[] arry = {2,5,7,8,4};
        int size = 3;
        int[] b = {2,3,4};


        Node head = Node.convertArrayToLinkedList(arry);
        Node.printLinkedList(head);

        Node newHead = reverseByGivenSize(head, size,b, 0);
        Node.printLinkedList(newHead);

    }




    public static Node reverseByGivenSize(Node head, int size, int b[], int index){
        if(head == null ){
            return head;
        }

        while(index < size && b[index] == 0){
            index++;
        }
        if(index >= size){
            return head;
        }

        int count  = 0;
        Node curr = head;
        Node next =curr.next;
        Node prev =null;


        if(b[index] != 1) {
            while (count < b[index] && curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
        }else{
            curr = head;
            prev = head;
            next = head.next;
        }

        index++;
        while(index < size && b[index] == 0){
            index++;
        }
        if(next != null){
            if(index < size) {
                head.next = reverseByGivenSize(next, size, b, index);
            }else{
                head.next = next;
            }
        }
        return prev;
    }

}
