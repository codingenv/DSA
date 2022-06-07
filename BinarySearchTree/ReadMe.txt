Binary Search Tree Data Structure:
=======================================

Binary Search Tree is a node-based binary tree data structure which has the following properties:  

	1. The left subtree of a node contains only nodes with 
	   keys lesser than the node’s key.
    2. The right subtree of a node contains only nodes with 
	   keys greater than the node’s key.
    3. The left and right subtree each must also be a binary search tree.
    4. There must be no duplicate nodes.
	
	
	Example
	
                                8
                             /     \
                            3        10
                         /    \          \
                        1      6          14
                             /  \        /
                            4    7      13
							
							
							
Programs
============
EASY:
	1. Count the nodes of a BST for a given range. CountNodesInRange.java