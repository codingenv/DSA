package BinaryTree;

/*
Get minimum value of a tree
*/
public class GetMinElement {
    public static void main(String args[]){
        Node node = new Node();
        node = node.getRandomCreatedTree();

        System.out.println("Min Element of a Binary Tree: " + getMinElement(node));
    }

    public static int getMinElement(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        int res = root.data;
        int lres = getMinElement(root.left);
        int rres = getMinElement(root.right);

        if(lres<res){
            res = lres;
        }
        if(rres< res){
            res = rres;
        }
        return res;

    }
}
