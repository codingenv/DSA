package com.binarysearchtree;

public class CountNodesInRange {


    // Function to count nodes in the BST that lie within a given range
    public static int countNodes(Node root, int low, int high)
    {
        // base case
        if (root == null) {
            return 0;
        }

        // if the current node lies within the current range, increment the count
        // and recur for both left and right subtree
        if (root.data >= low && root.data <= high)
        {
            return 1 + countNodes(root.left, low, high) +
                    countNodes(root.right, low, high);
        }

        // recur for the left subtree if range lies on its left subtree
        if (root.data > high) {
            return countNodes(root.left, low, high);
        }

        // recur for the right subtree if the range lies on its right subtree
        if (root.data < low) {
            return countNodes(root.right, low, high);
        }
        return 0;
    }

    public static void main(String args[]){
        // input range
        int low = 12, high = 20;
        int[] keys = { 15, 25, 20, 22, 30, 18, 10, 8, 9, 12, 6 };

        // construct BST from the above keys
        Node root = null;
        for (int key: keys) {
            root = Node.insert(root, key);
        }

        System.out.println("The total number of nodes is " +
                countNodes(root, low, high));
    }
}
