package com.practice.binary;

/*
Given sequence:
Inorder sequence: D B E A F C (Left,Root,Right
Preorder sequence: A B D E C F

 */

public class BuildBinaryTree {

    Node root;
    static int preIndex = 0;

    Node buildTree(int inOrderArr[], int preOrderArr[], int inStart, int inEnd){
        if(inStart > inEnd){
            return null;
        }

        Node tNode = new Node(preOrderArr[preIndex++]);
        if(inStart == inEnd){
            return tNode;
        }

        int inIndex = search(inOrderArr, inStart, inEnd, tNode.data);

        tNode.left = buildTree(inOrderArr, preOrderArr, inStart, inIndex  -1);
        tNode.right = buildTree(inOrderArr, preOrderArr, inIndex +1, inEnd);

        return tNode;
    }

    int search(int arr[], int start, int end, int value){
        int i;
        for(i = start; i < end; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return i;
    }

    public static void main(String args[]){
        BuildBinaryTree obj = new BuildBinaryTree();
        int []inOrderArr = {32, 30, 40, 26, 50,35};
        int []preOrderArr = {26, 30,32,40,35,50};

        int len = inOrderArr.length;
        Node root = obj.buildTree(inOrderArr, preOrderArr, 0, len-1);

        Node.inOrderTraversal(root);

    }
}
