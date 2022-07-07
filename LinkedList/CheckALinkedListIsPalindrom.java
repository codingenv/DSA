package LinkedList;

import java.util.Stack;

public class CheckALinkedListIsPalindrom {
    public static void main(String args[]){
        int [] arr = {1,2,3,3,2,1};
        Node head = Node.convertArrayToLinkedList(arr);
        Node.printLinkedList(head);

        System.out.println("The is linked is palindrome: " + checkPalindrome(head));
    }

    static boolean checkPalindrome(Node head){
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
}
