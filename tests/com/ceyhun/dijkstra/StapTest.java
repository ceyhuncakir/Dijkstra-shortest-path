package com.ceyhun.dijkstra;

import org.junit.Test;

import static org.junit.Assert.*;

public class StapTest {

    @Test
    public void Stap() {
        Node RitUtrecht = new Node("Utrecht");
        Node RitAmsterdam = new Node("Amsterdam");
        Stap vanAnaarB = new Rit(10, RitAmsterdam);
        RitUtrecht.addEdge(vanAnaarB);

        assertEquals(10, vanAnaarB.getDistance());
    }
}