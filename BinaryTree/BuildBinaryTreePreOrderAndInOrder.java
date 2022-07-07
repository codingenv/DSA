package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class BuildBinaryTreePreOrderAndInOrder {


    public Node buildBinaryTreeSolution(int []preOrder, int []inOrder){
        Map<Integer,Integer> inmap = new HashMap<>();
        for(int i = 0; i< inOrder.length ;i++){
            inmap.put(inOrder[i], i);
        }

        Node root = buildTree(preOrder, 0, preOrder.length -1,
                inOrder, 0, inOrder.length -1, inmap);

        return root;

    }

    Node buildTree(int preOrderArr[], int preOrderStart, int preOrderEnd,
                   int inOrderArr[], int inOrderStart, int inOrderEnd, Map<Integer, Integer> inmap){

        if(preOrderStart > preOrderEnd || inOrderStart > inOrderEnd){
            return null;
        }

        Node tNode = new Node(preOrderArr[preOrderStart]);
        int inRoot = inmap.get(tNode.data);
        int numsLeft = inRoot - inOrderStart;

        tNode.left = buildTree(preOrderArr, preOrderStart + 1, preOrderStart + numsLeft,
                inOrderArr, inOrderStart, inRoot -1, inmap);

        tNode.right = buildTree(preOrderArr, preOrderStart + numsLeft + 1, preOrderEnd,
                inOrderArr, inRoot + 1, inOrderEnd, inmap);

        return tNode;
    }

    public static void main(String args[]){
        BuildBinaryTreePreOrderAndInOrder obj = new BuildBinaryTreePreOrderAndInOrder();
        int []inOrderArr = {9,3,15,20,7};
        int []preOrderArr = {3,9,20,15,7};

        int len = inOrderArr.length;
        Node root = obj.buildBinaryTreeSolution(preOrderArr, inOrderArr);

        Node.inOrderTraversal(root);

    }

}
