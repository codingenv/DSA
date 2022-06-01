package com.practice.binary.tree;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopAndBottomViewOfATree {
    public static void main(String args[]){
        Node node = new Node();
        Node root = node.getRandomCreatedTree();
        System.out.println("===============TOP VIEW===============");
        printTopView(root);
        System.out.println("===============BOTTOM VIEW===============");
        printBottomView(root);

    }

    static class Pair{
        int hd;
        Node node;

        public Pair(int hd, Node node){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void printTopView(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node.data);
            }

            if(curr.node.left !=null){
                q.add(new Pair(curr.hd -1, curr.node.left));
            }

            if(curr.node.right !=null){
                q.add(new Pair(curr.hd +1, curr.node.right));
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public static void printBottomView(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            map.put(curr.hd, curr.node.data);

            if(curr.node.left !=null){
                q.add(new Pair(curr.hd -1, curr.node.left));
            }

            if(curr.node.right !=null){
                q.add(new Pair(curr.hd +1, curr.node.right));
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
