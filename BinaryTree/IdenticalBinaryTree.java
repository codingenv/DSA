package com.practice.binary;

public class IdenticalBinaryTree {

    public static void main(String []args){
        Node node = new Node();
        Node root1 = node.getRandomCreatedTree();
        Node root2 = node.getRandomCreatedTree2();
        System.out.println("Identical Binary Tree: " + isIdentical(root1, root2));
    }

    public static boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }

        return (root1 != null && root2 != null) &&
                (root1.data == root2.data) &&
                isIdentical(root1.left, root2.left) &&
                isIdentical(root1.right, root2.right);
    }
}
