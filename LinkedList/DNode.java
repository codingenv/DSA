package com.linkedList;

public class DNode {
    int data;
    DNode prev;
    DNode next;

    public DNode(){}

    public DNode(int data, DNode prev, DNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public DNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public static void printList(DNode head){
        System.out.println();
        DNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static DNode addAtEnd(DNode head, int data){
        DNode newNode = new DNode(data);
        if(head ==  null){
            head = newNode;
            return head;
        }

        DNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static DNode convertArrayToDList(int [] arr){
        int len = arr.length;
        DNode head = null;
        for(int i = 0; i< len; i++){
            head = addAtEnd(head, arr[i]);
        }

        return head;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        DNode head = DNode.convertArrayToDList(arr);
        DNode.printList(head);
    }

}
