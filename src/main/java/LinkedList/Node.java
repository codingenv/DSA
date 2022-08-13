package LinkedList;

public class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next =null;
    }

    Node (){}

    Node (int data, Node node){
        this.data = data;
        this.next = node;
    }

    // Basic opertation

    public static void printLinkedList(Node node){
        System.out.println("Printing given linked list");
        while ( node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static Node getRandomLinkedlist(){
        Node head = new Node(0);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(10);

        return head;
    }
    public static Node getRandomLinkedlist2(){
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(13);
        head.next.next.next.next.next.next.next = new Node(15);
        return head;
    }

    public static Node getSequentialLinkedlist3(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        return head;
    }

    public static Node addAtBeginingofListList(Node head, int data){
        if(head == null){
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public static Node addAtEndOfLinkedList(Node head, int data){
        if(head == null){
            head = new Node(data);
            return head;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
            return head;
        }
    }


    public static Node [] getIntersectLinkedList(){
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        Node head2 = new Node(10);
        head2.next = new Node(18);
        head2.next.next = head1.next.next;

        Node [] arr  = {head1, head2};
        return arr;
    }

    public static Node getLinkedListWithLoop(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = head.next.next.next.next;
        return head;
    }

    public static Node convertArrayToLinkedList(int [] arr){
        Node head = null;
        int len = arr.length;
        for(int i = 0; i< len; i++){
            head = addAtEndOfLinkedList(head, arr[i]);
        }
        return head;
    }



}
