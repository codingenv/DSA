package BinaryTree;

public class HeightOfABinaryTree {
    public static void main(String args[]){
        Node node = new Node();
        node = node.getRandomCreatedTree();

        System.out.println("Height of a Binary Tree: " + getHeightOfTree(node));
    }

    public static int getHeightOfTree(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(getHeightOfTree(root.left) , getHeightOfTree(root.right)) + 1;
    }
}
