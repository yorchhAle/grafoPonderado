package com.mycompany.grafoponderadoo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/** @author jorge**/

@Setter
@Getter
public class Vertice {
    private String nombre;
    private List<Adyacencia> adyacencias;
    
    public Vertice (String nombre){
        this.nombre=nombre;
        this.adyacencias= new LinkedList<>();
    }
    
    public void addAdyacencias (Adyacencia ... adyacencias){
        Collections.addAll(this.adyacencias,adyacencias);
    }
    
}
