package BinaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BuildBinaryTreeFromPreAndPostOrderArray {

    public static Node buildBinaryTreeFromPreAndPostOrderArray(int []preOrder,int []postOrder){
        if(postOrder.length == 0){
            return null;
        }

        // Map is used to find any index of any element in the
        // given post order array.
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< postOrder.length; i++){
            map.put(postOrder[i], i);
        }

        // Holds the index of next element in pre order array.
        AtomicInteger pIndex= new AtomicInteger(0);

        int start = 0;
        int end = preOrder.length -1;

        return buildBinaryTreeFromPreAndPostOrderArrayUtility(preOrder, pIndex, start, end, map);
    }

    public static Node buildBinaryTreeFromPreAndPostOrderArrayUtility(int [] preOrder, AtomicInteger pIndex, int start, int end, Map<Integer, Integer> map){

        Node root = new Node(preOrder[pIndex.getAndIncrement()]);

        //return if Keys are processed.

        if(pIndex.get() == preOrder.length){
            return root;
        }

        int index = map.get(preOrder[pIndex.get()]);

        if(start <= index && index + 1 <= end -1){
            root.left = buildBinaryTreeFromPreAndPostOrderArrayUtility(preOrder, pIndex, start, index, map);
            root.right = buildBinaryTreeFromPreAndPostOrderArrayUtility(preOrder, pIndex, index+1, end -1,map);
        }

        return root;
    }




    public static void main(String [] args){
        //int preOrder [] = {1,2,4,5,3,6,8,9,7};
        //int postOrder [] = {4,5,2,8,9,6,7,3,1};
        int preOrder [] = {1,2,4,8,9,5,3,6,7};
        int postOrder [] = {8,9,4,5,2,6,7,3,1};
        Node root =  buildBinaryTreeFromPreAndPostOrderArray(preOrder, postOrder);
        System.out.println("======PreOrder======");
        Node.PreOrderTraversal(root);
        System.out.println("\n======InOrder======");
        Node.inOrderTraversal(root);
        System.out.println("\n======PostOrder======");
        Node.PostOrderTraversal(root);
    }
}
