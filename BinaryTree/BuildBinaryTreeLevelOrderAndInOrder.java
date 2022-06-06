package com.practice.binary;

import java.util.HashMap;
import java.util.Map;

public class BuildBinaryTreeLevelOrderAndInOrder {


    public Node buildBinaryTreeSolution(int []levelOrder, int []inOrder){
        Map<Integer,Integer> inmap = new HashMap<>();
        for(int i = 0; i< inOrder.length ;i++){
            inmap.put(inOrder[i], i);
        }

        Map<Integer, Integer> levelMap = new HashMap<>();
        for(int i =0; i< levelOrder.length; i++){
            levelMap.put(levelOrder[i], i);
        }

        Node root = buildTree(null, levelOrder,
                inOrder, 0, inOrder.length -1);

        return root;

    }

    Node buildTree(Node startNode, int[] levelOrder,
                   int[] inOrder, int inStart, int inEnd){

        // if start index is more than end index
        if (inStart > inEnd)
            return null;

        if (inStart == inEnd)
            return new Node(inOrder[inStart]);

        boolean found = false;
        int index = 0;

        // it represents the index in inOrder array of
        // element that appear first in levelOrder array.
        for (int i = 0; i < levelOrder.length - 1; i++) {
            int data = levelOrder[i];
            for (int j = inStart; j < inEnd; j++) {
                if (data == inOrder[j]) {
                    startNode = new Node(data);
                    index = j;
                    found = true;
                    break;
                }
            }
            if (found == true)
                break;
        }

        // elements present before index are part of left
        // child of startNode. elements present after index
        // are part of right child of startNode.
        startNode.left = buildTree(startNode, levelOrder, inOrder,
                        inStart, index - 1);
        startNode.right = buildTree(startNode, levelOrder, inOrder,
                        index + 1, inEnd);

        return startNode;
    }

    public static void main(String args[]){
        BuildBinaryTreeLevelOrderAndInOrder obj = new BuildBinaryTreeLevelOrderAndInOrder();
        int []inOrderArr = {4,8,10,12,14,20,22};
        int []levelOrderArr = {20,8,22,4,12,10,14};

        int len = inOrderArr.length;
        Node root = obj.buildBinaryTreeSolution(levelOrderArr, inOrderArr);

        Node.inOrderTraversal(root);

    }

}
