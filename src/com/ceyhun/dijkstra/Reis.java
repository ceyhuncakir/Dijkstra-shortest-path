package com.ceyhun.dijkstra;

import java.util.PriorityQueue;

public class Reis {

    PriorityQueue<Node> route;

    public Reis(PriorityQueue<Node> route){
        this.route = route;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("start van rit:\n");
        for (Node node : route){
            out.append(String.format("%s, %s\n", "stad: " + node.name, node.afstand + " Km"));
        }
        return out.toString();
    }
}
