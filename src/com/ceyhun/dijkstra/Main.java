package com.ceyhun.dijkstra;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dijkstra dijkstra = new Dijkstra();

        ArrayList<Node> map = new ArrayList<>();
        ArrayList<Node> vluchtMap = new ArrayList<>();
        ArrayList<Node> spoorMap = new ArrayList<>();

        Node RitUtrecht = new Node("Utrecht");
        Node RitAmsterdam = new Node("Amsterdam");
        Node RitWoerden = new Node("Woerden");
        Node RitEindhoven = new Node("Eindhoven");
        Node RitRotterdam = new Node("Rotterdam");
        Node RitLelystad = new Node("Lelystad");

        Node vluchtUtrecht = new Node("Utrecht");
        Node vluchtAmsterdam = new Node("Amsterdam");
        Node vluchtWoerden = new Node("Woerden");
        Node vluchtEindhoven = new Node("Eindhoven");
        Node vluchtRotterdam = new Node("Rotterdam");
        Node vluchtLelystad = new Node("Lelystad");

        Node treinritUtrecht = new Node("Utrecht");
        Node treinritAmsterdam = new Node("Amsterdam");
        Node treinritWoerden = new Node("Woerden");
        Node treinritEindhoven = new Node("Eindhoven");
        Node treinritRotterdam = new Node("Rotterdam");
        Node treinritLelystad = new Node("Lelystad");

        map.add(RitUtrecht);
        map.add(RitAmsterdam);
        map.add(RitWoerden);
        map.add(RitEindhoven);
        map.add(RitRotterdam);
        map.add(RitLelystad);

        vluchtMap.add(vluchtUtrecht);
        vluchtMap.add(vluchtAmsterdam);
        vluchtMap.add(vluchtWoerden);
        vluchtMap.add(vluchtEindhoven);
        vluchtMap.add(vluchtRotterdam);
        vluchtMap.add(vluchtLelystad);

        spoorMap.add(treinritUtrecht);
        spoorMap.add(treinritAmsterdam);
        spoorMap.add(treinritWoerden);
        spoorMap.add(treinritEindhoven);
        spoorMap.add(treinritRotterdam);
        spoorMap.add(treinritLelystad);

        Stap vanAnaarB = new Rit(10, RitAmsterdam);
        Stap vanAnaarC = new Rit(15, RitWoerden);
        Stap vanBnaarD = new Rit(12, RitEindhoven);
        Stap vanBnaarF = new Rit(15, RitLelystad);
        Stap vanCnaarE = new Rit(10, RitRotterdam);
        Stap vanDnaarF = new Rit(1, RitLelystad);
        Stap vanDnaarE = new Rit(2, RitRotterdam);
        Stap vanFnaarE = new Rit(5, RitRotterdam);

        Stap VluchtvanAnaarB = new Vlucht(10, 10, vluchtAmsterdam);
        Stap VluchtvanAnaarC = new Vlucht(15, 0, vluchtWoerden);
        Stap VluchtvanBnaarD = new Vlucht(12, 30, vluchtEindhoven);
        Stap VluchtvanBnaarF = new Vlucht(15, 23, vluchtLelystad);
        Stap VluchtvanCnaarE = new Vlucht(100, 3, vluchtRotterdam);
        Stap VluchtvanDnaarF = new Vlucht(1, 44, vluchtLelystad);
        Stap VluchtvanDnaarE = new Vlucht(2, 58, vluchtRotterdam);
        Stap VluchtvanFnaarE = new Vlucht(5, 12, vluchtRotterdam);

        Stap TreinvanAnaarB = new Treinrit(10, treinritAmsterdam);
        Stap TreinvanAnaarC = new Treinrit(15, treinritWoerden);
        Stap TreinvanBnaarD = new Treinrit(12, treinritEindhoven);
        Stap TreinvanBnaarF = new Treinrit(15, treinritLelystad);
        Stap TreinvanCnaarE = new Treinrit(10, treinritRotterdam);
        Stap TreinvanDnaarF = new Treinrit(1, treinritLelystad);
        Stap TreinvanDnaarE = new Treinrit(2, treinritRotterdam);
        Stap TreinvanFnaarE = new Treinrit(5, treinritRotterdam);

        RitUtrecht.addEdge(vanAnaarB);
        RitUtrecht.addEdge(vanAnaarC);
        RitAmsterdam.addEdge(vanBnaarD);
        RitAmsterdam.addEdge(vanBnaarF);
        RitWoerden.addEdge(vanCnaarE);
        RitEindhoven.addEdge(vanDnaarF);
        RitEindhoven.addEdge(vanDnaarE);
        RitLelystad.addEdge(vanFnaarE);

        vluchtUtrecht.addEdge(VluchtvanAnaarB);
        vluchtUtrecht.addEdge(VluchtvanAnaarC);
        vluchtAmsterdam.addEdge(VluchtvanBnaarD);
        vluchtAmsterdam.addEdge(VluchtvanBnaarF);
        vluchtWoerden.addEdge(VluchtvanCnaarE);
        vluchtEindhoven.addEdge(VluchtvanDnaarF);
        vluchtEindhoven.addEdge(VluchtvanDnaarE);
        vluchtLelystad.addEdge(VluchtvanFnaarE);

        treinritUtrecht.addEdge(TreinvanAnaarB);
        treinritUtrecht.addEdge(TreinvanAnaarC);
        treinritAmsterdam.addEdge(TreinvanBnaarD);
        treinritAmsterdam.addEdge(TreinvanBnaarF);
        treinritWoerden.addEdge(TreinvanCnaarE);
        treinritEindhoven.addEdge(TreinvanDnaarF);
        treinritEindhoven.addEdge(TreinvanDnaarE);
        treinritLelystad.addEdge(TreinvanFnaarE);

        Reis Rit = dijkstra.bestPath(map);
        Reis vlucht = dijkstra.bestPath(vluchtMap);
        Reis treinRit = dijkstra.bestPath(spoorMap);

        System.out.println(Rit.toString());
        System.out.println(vlucht.toString());
        System.out.println(treinRit.toString());
    }
}
