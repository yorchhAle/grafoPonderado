package com.mycompany.grafoponderadoo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**@author jorge**/
@Setter
@Getter
public class GrafoPonderado {
    private String nombre;
    private List<Vertice>vertices;

    public GrafoPonderado(String nombre) {
        this.nombre = nombre;
        this.vertices = new LinkedList<>();
    }
    
    public void addVertice(Vertice... vertices){
        Collections.addAll(this.vertices, vertices);
    }
    
    
}
