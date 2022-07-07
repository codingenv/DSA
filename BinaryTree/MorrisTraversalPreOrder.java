package BinaryTree;

public class MorrisTraversalPreOrder {
    Node root;

    public static void main(String []args){
        Node root = Node.getBinaryTree();
        traverse(root);
        Node.PreOrderTraversal(root);
    }

    public static void traverse(Node node) {
        while (node != null) {
            // If left child is null, print the current node data. Move to right child.
            if (node.left == null) {
                System.out.println(node.data);
                node = node.right;
            } else {
                // Find the inorder Predecessor
                Node current = node.left;
                while (current.right != null && current.right != node) {
                    current = current.right;
                }

                // If the right child of inorder predecessor already points to this node
                if (current.right == node) {
                    current.right = null;
                    node = node.right;
                } else {
                    System.out.println(node.data + " ");
                    current.right = node;
                    node = node.left;
                }
            }
        }
    }
}
