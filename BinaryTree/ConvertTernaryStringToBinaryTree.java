package com.practice.binary;

public class ConvertTernaryStringToBinaryTree {

    public static Node convertExpression(char[] exp, int i){
        if(i >= exp.length){
            return null;
        }

        Node root = new Node(exp[i]);
        i++;

        if(i<exp.length && exp[i] == '?'){
            root.left = convertExpression(exp, i+1);
        }else if(i<exp.length && exp[i] == ':'){
            root.right = convertExpression(exp, i+1);
        }

        return root;
    }

    public static void main(String []args){
        String exp = "a?b?c:d:e";
        char[] expression = exp.toCharArray();
        Node root = convertExpression(expression, 0);

        Node.inOrderTraversalForCharData(root);
    }
}
