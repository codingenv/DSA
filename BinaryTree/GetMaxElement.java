package com.practice.binary;

public class GetMaxElement {
    public static void main(String args[]){
        Node node = new Node();
        node = node.getRandomCreatedTree();

        System.out.println("Max Element of a Binary Tree: " + getMaxElement(node));
    }

    public static int getMaxElement(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int res = root.data;
        int lres = getMaxElement(root.left);
        int rres = getMaxElement(root.right);

         if(lres>res){
             res = lres;
         }
        if(rres> res){
            res = rres;
        }
        return res;

    }
}
