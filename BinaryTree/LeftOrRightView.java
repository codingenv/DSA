package com.practice.binary.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftOrRightView {
    public static void main(String args[]){
        Node node = new Node();
        Node root = node.getRandomCreatedTree();
        System.out.println("===============LEFT VIEW==============");
        printleftView(root);
        System.out.println("===============RIGHT VIEW==============");
        printRightView(root);


    }

    public static void printleftView(Node root){
        Map<Integer, Node> map = new HashMap<>();
        printleftViewUtil(root, map, 0);
        if(map.size() != 0){
            for(Map.Entry<Integer, Node> node:map.entrySet()){
                System.out.println(node.getValue().data);
            }
        }
    }

    public static void printleftViewUtil(Node root, Map<Integer, Node> map, int level){
        if(root == null){
            return;
        }

        if(!map.containsKey(level)){
            map.put(level, root);
        }

        printleftViewUtil(root.left, map, level + 1);
        printleftViewUtil(root.right, map, level + 1);
    }

    public static void printRightView(Node root){
        Map<Integer, Node> map = new HashMap<>();
        printRightViewUtil(root, map, 0);
        if(map.size() != 0){
            for(Map.Entry<Integer, Node> node:map.entrySet()){
                System.out.println(node.getValue().data);
            }
        }
    }

    public static void printRightViewUtil(Node root, Map<Integer, Node> map, int level){
        if(root == null){
            return;
        }
        map.put(level,root);

        printRightViewUtil(root.left, map, level + 1);
        printRightViewUtil(root.right, map, level + 1);
    }
}
