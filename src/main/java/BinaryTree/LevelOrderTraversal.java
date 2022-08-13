package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String args[]){
        Node node = new Node();
        Node root = node.getRandomCreatedTree();
        printlevel(root);


    }

    public static void printlevel(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data);

            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
}
