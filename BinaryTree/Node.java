package com.practice.binary;

public class Node {
    int data;
    char charData;
    String stringData;
    Node left;
    Node right;
	
	
    public Node(int item)
    {
        this.data = item;
        this.left = null;
        this.right = null;
    }

    public Node(char item){
        this.charData = item;
        this.left = null;
        this.right = null;
    }

    public Node(String item){
        this.stringData = item;
        this.left = null;
        this.right = null;
    }

    public Node(){}


    public Node getRandomCreatedTree(){
        Node root = new Node(5);
        root.left = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(9);
        root.right = new Node(7);

        return root;
    }

    public Node getRandomCreatedTree2(){
        Node root = new Node(5);
        root.left = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(23);
        root.right = new Node(7);

        return root;
    }

    public static Node getBinaryTree(){
        Node tree = new Node();
        tree = new Node(10);
        tree.left = new Node(12);
        tree.right = new Node(15);
        tree.left.left = new Node(25);
        tree.left.right = new Node(30);
        tree.right.left = new Node(36);
        return tree;
    }

    //Inorder Traversal ( left, root, right)
    public static void inOrderTraversal(Node node){
        if(node == null)
        {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    //Pre Order Traversal (root, left, right)
    public static void PreOrderTraversal(Node node){
        if(node == null)
        {
            return;
        }
        System.out.print(node.data + " ");
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }

    // Post order Traversal (left, right, root)
    public static void PostOrderTraversal(Node node){
        if(node == null)
        {
            return;
        }
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    //Inorder Traversal ( left, root, right)
    public static void inOrderTraversalForCharData(Node node){
        if(node == null)
        {
            return;
        }
        inOrderTraversalForCharData(node.left);
        System.out.print(node.charData + " ");
        inOrderTraversalForCharData(node.right);
    }

    //Pre Order Traversal (root, left, right)
    public static void PreOrderTraversalForCharData(Node node){
        if(node == null)
        {
            return;
        }
        System.out.print(node.charData + " ");
        PreOrderTraversalForCharData(node.left);
        PreOrderTraversalForCharData(node.right);
    }

    // Post order Traversal (left, right, root)
    public static void PostOrderTraversalForCharData(Node node){
        if(node == null)
        {
            return;
        }
        PostOrderTraversalForCharData(node.left);
        PostOrderTraversalForCharData(node.right);
        System.out.print(node.charData + " ");
    }

    //Inorder Traversal ( left, root, right)
    public static void inOrderTraversalForStringData(Node node){
        if(node == null)
        {
            return;
        }
        inOrderTraversalForStringData(node.left);
        System.out.print(node.stringData + " ");
        inOrderTraversalForStringData(node.right);
    }

    //Pre Order Traversal (root, left, right)
    public static void PreOrderTraversalForStringData(Node node){
        if(node == null)
        {
            return;
        }
        System.out.print(node.stringData + " ");
        PreOrderTraversalForStringData(node.left);
        PreOrderTraversalForStringData(node.right);
    }

    // Post order Traversal (left, right, root)
    public static void PostOrderTraversalForStringData(Node node){
        if(node == null)
        {
            return;
        }
        PostOrderTraversalForStringData(node.left);
        PostOrderTraversalForStringData(node.right);
        System.out.print(node.stringData + " ");
    }
}
