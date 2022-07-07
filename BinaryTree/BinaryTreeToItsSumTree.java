package BinaryTree;

public class BinaryTreeToItsSumTree {


    public static int toSumTree(Node node){
        if(node == null){
            return 0;
        }
        int oldValue = node.data;
        node.data = toSumTree(node.left) + toSumTree(node.right);
        return oldValue + node.data;
    }



    public static void main(String [] args){
        Node root = Node.getBinaryTree();
        toSumTree(root);
        Node.inOrderTraversal(root);

    }
}
