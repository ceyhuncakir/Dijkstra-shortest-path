package com.ceyhun.dijkstra;

public class Stap {

    Node bestemming;

    int getDistance(){
        System.out.println("geen rit");
        return 0;
    }

    void addDestination(Node node){
        this.bestemming = node;
    }
}
