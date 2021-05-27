package com.ceyhun.dijkstra;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

    Reis bestPath(ArrayList<Node> nodes){
        ArrayList<Node> nietgeregeld = new ArrayList<>();
        ArrayList<Node> geregeld = new ArrayList<>();
        PriorityQueue<Node> route = new PriorityQueue<>();
        nietgeregeld.add(nodes.get(0));

        Node endNode = null;

        Node start = nietgeregeld.get(0);
        start.afstand = 0;
        while (nietgeregeld.size() > 0){
            Node current = nietgeregeld.get(0);
            if(current.edges.size() == 0){
                endNode = current;
            }
            for (Stap stap : current.edges){
                Node destinationNode = stap.bestemming;
                if(destinationNode.afstand > current.afstand + stap.getDistance()){
                    destinationNode.afstand = current.afstand + stap.getDistance();
                    destinationNode.source = current;
                }
                if(!geregeld.contains(destinationNode) && !nietgeregeld.contains(destinationNode)){
                    nietgeregeld.add(destinationNode);
                }
            }
            geregeld.add(nietgeregeld.get(0));
            nietgeregeld.remove(0);
        }

        Node sourceNode = endNode;
        do{
            Node currentNode = sourceNode;
            route.add(currentNode);
            sourceNode = currentNode.source;
        } while (sourceNode != null);
        return new Reis(route);
    }
}
