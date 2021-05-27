package com.ceyhun.dijkstra;

public class Vlucht extends Stap implements Comparable<Vlucht>{

     int Euro;
     int kansopvetraging;

    public Vlucht(int Euro, int kansopvetraging, Node node){
        this.Euro = Euro;
        this.kansopvetraging = kansopvetraging;
        this.bestemming = node;
    }

    int getDistance(){
        return this.kansopvetraging + this.Euro;
    }

    @Override
    public int compareTo(Vlucht o) {
        if (o.equals(this)){
            return 0;
        } else if(o.kansopvetraging + o.Euro < this.kansopvetraging + this.Euro){
            return 1;
        }else{
            return -1;
        }
    }
}
