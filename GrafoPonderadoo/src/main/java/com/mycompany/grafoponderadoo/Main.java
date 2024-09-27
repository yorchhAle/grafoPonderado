package com.mycompany.grafoponderadoo;

/** * @author jorge**/
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Vertice v1= new Vertice("1");
        Vertice v2= new Vertice("2");
        Vertice v3= new Vertice("3");
        Vertice v4= new Vertice("4");
        Vertice v5= new Vertice("5");
        Vertice v6= new Vertice("6");
        v1.addAdyacencias(new Adyacencia(v2,4),new Adyacencia(v3,10),new Adyacencia(v4,14));
        v2.addAdyacencias(new Adyacencia(v5,5),new Adyacencia(v3,9),new Adyacencia(v1,4));
        v3.addAdyacencias(new Adyacencia(v1,10),new Adyacencia(v2,9),new Adyacencia(v5,8),new Adyacencia(v6,14),new Adyacencia(v4,2));

        GrafoPonderado grafo=new GrafoPonderado("Garfinator, the last one");
        grafo.addVertice(v1,v2,v3,v4,v5,v6);
    }
}
