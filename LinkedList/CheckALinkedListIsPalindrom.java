package LinkedList;

import java.util.Stack;

public class CheckALinkedListIsPalindrom {

    static class NodeWrapper
    {
        public Node node;

        NodeWrapper(Node node) {
            this.node = node;
        }
    }

    public static void main(String args[]){
        int [] arr = {1,2,3,3,2,1};
        Node head = Node.convertArrayToLinkedList(arr);
        Node.printLinkedList(head);

        System.out.println("The is linked is palindrome: " + checkPalindromeUsingStack(head));
        System.out.println("The is linked is palindrome: " + checkPalindromeByRecursion(new NodeWrapper(head), head));
        System.out.println("The is linked is palindrome: " + checkPalindromeByReversing2ndHalf(head));


    }

    static boolean checkPalindromeUsingStack(Node head){
        Stack<Integer> stack = new Stack<>();

        Node temp = head;
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while(temp!= null){
            Integer checkvalue = stack.pop();
            if(temp.data != checkvalue){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    static boolean checkPalindromeByRecursion(NodeWrapper leftNode, Node rightNode) {
        if(rightNode == null) return true;

        boolean resultSublist = checkPalindromeByRecursion(leftNode, rightNode.next);
        if(resultSublist==false) return false;
        boolean result = leftNode.node.data == rightNode.data;
        leftNode.node = leftNode.node.next;
        return result;
    }



    static boolean checkPalindromeByReversing2ndHalf(Node head){


        return true;
    }

}
