package BinaryTree;

/*

            10
        /         \
     12              15
    /   \           /
 25       30     36

Inorder -> 25, 12, 30, 10, 36, 15

 Inorder Traversal ( left, root, right)
 Pre Order Traversal (root, left, right)
 Post order Traversal (left, right, root)


               10
          /          \
      15              12
    /    \           /    \
   null  36      30         25

 Inorder -> 15, 36, 10, 30, 12, 25

 */
public class MirrorTree {
    public static void main(String [] args){

        Node root = Node.getBinaryTree();
        Node.inOrderTraversal(root);
        mirrorTree(root);
        System.out.println("\n========AFTER MIRROR=======");
        Node.inOrderTraversal(root);
    }

    public static Node mirrorTree(Node node){
        if(node == null){
            return node;
        }
        // Call the left tree and right tree alternatively
        Node left = mirrorTree(node.left);
        Node right = mirrorTree(node.right);

        // Swap the left Node with right node
        node.left = right;
        node.right = left;

        return node;
    }


}
