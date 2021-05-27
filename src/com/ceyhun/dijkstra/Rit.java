package com.ceyhun.dijkstra;

public class Rit extends Stap implements Comparable<Rit>{
    int afstandInKM;

    public Rit(int afstandInKM, Node node){
        this.afstandInKM = afstandInKM;
        this.bestemming = node;
    }

    int getDistance(){
        return afstandInKM;
    }

    @Override
    public int compareTo(Rit o) {
        if (o.equals(this)){
            return 0;
        } else if(o.afstandInKM < this.afstandInKM){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Rit{" +
                "afstand In KM=" + afstandInKM +
                '}';
    }
}
