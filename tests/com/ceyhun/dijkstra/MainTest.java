package com.ceyhun.dijkstra;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void Main() {
        Dijkstra dijkstra = new Dijkstra();

        ArrayList<Node> map = new ArrayList<>();

        Node RitUtrecht = new Node("Utrecht");
        Node RitAmsterdam = new Node("Amsterdam");
        Node RitWoerden = new Node("Woerden");
        Node RitEindhoven = new Node("Eindhoven");
        Node RitRotterdam = new Node("Rotterdam");
        Node RitLelystad = new Node("Lelystad");

        map.add(RitUtrecht);
        map.add(RitAmsterdam);
        map.add(RitWoerden);
        map.add(RitEindhoven);
        map.add(RitRotterdam);
        map.add(RitLelystad);

        Stap vanAnaarB = new Rit(10, RitAmsterdam);
        Stap vanAnaarC = new Rit(15, RitWoerden);
        Stap vanBnaarD = new Rit(12, RitEindhoven);
        Stap vanBnaarF = new Rit(15, RitLelystad);
        Stap vanCnaarE = new Rit(10, RitRotterdam);
        Stap vanDnaarF = new Rit(1, RitLelystad);
        Stap vanDnaarE = new Rit(2, RitRotterdam);
        Stap vanFnaarE = new Rit(5, RitRotterdam);

        RitUtrecht.addEdge(vanAnaarB);
        RitUtrecht.addEdge(vanAnaarC);
        RitAmsterdam.addEdge(vanBnaarD);
        RitAmsterdam.addEdge(vanBnaarF);
        RitWoerden.addEdge(vanCnaarE);
        RitEindhoven.addEdge(vanDnaarF);
        RitEindhoven.addEdge(vanDnaarE);
        RitLelystad.addEdge(vanFnaarE);

        Reis Rit = dijkstra.bestPath(map);
        assertEquals(5, vanFnaarE.getDistance());
        System.out.println(Rit.toString());

    }
}