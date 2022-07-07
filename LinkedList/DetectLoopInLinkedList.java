package LinkedList;

/*
    Floyd's Cycle:
    - Traverse using two pointers
    - Move one pointer by 1 and other pointer by 2
    - If there pointers meet at same node, there is a node.

 */

public class DetectLoopInLinkedList {

    public static void main(String args[]) {
        Node head = Node.getLinkedListWithLoop();

        System.out.println(detectLoop(head));
    }

    static  Boolean detectLoop(Node head){
        Node slowPoniter = head;
        Node fastPoniter = head;
        Boolean flag = Boolean.FALSE;

        while(slowPoniter != null &&
            fastPoniter != null &&
                fastPoniter.next != null){

            slowPoniter = slowPoniter.next;
            fastPoniter = fastPoniter.next.next;
            if(slowPoniter == fastPoniter){
                flag = Boolean.TRUE;
                break;
            }
        }
        return flag;
    }


}
