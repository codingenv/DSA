package com.practice.binary;

public class MorrisTraversalInOrder {
    public static void main(String [] args){
        Node root = Node.getBinaryTree();
        convert(root);
        Node.inOrderTraversal(root);
    }

    public static void convert(Node node){
        Node current = node;
        while(current != null){
            if(current.left == null){
                System.out.println(current.data);
                current = current.right;
            }else{
                Node temp = current.left;
                while(temp.right != null && temp.right != current){
                    temp = temp.right;
                }

                if(temp.right == null){
                    temp.right = current;
                    current = current.left;
                }else{
                    temp.right = null;
                    System.out.println(current.data);
                    current = current.right;
                }
            }
        }
    }
}
