package com.ceyhun.dijkstra;

import java.util.PriorityQueue;

public class Node implements Comparable<Node> {

    String name;
    Integer afstand = Integer.MAX_VALUE;
    Node source;
    PriorityQueue<Stap> edges = new PriorityQueue();

    public Node(String name){
        this.name = name;
    }

    void addEdge(Stap stap){
        edges.add(stap);
    }

    @Override
    public int compareTo(Node node) {
        if (node.equals(this)){
            return 0;
        } else if(node.afstand < this.afstand){
            return 1;
        }else{
            return -1;
        }
    }

}
