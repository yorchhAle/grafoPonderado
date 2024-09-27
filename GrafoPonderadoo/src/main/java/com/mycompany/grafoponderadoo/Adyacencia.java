package com.mycompany.grafoponderadoo;

import lombok.Getter;
import lombok.Setter;

/**@author jorge**/
@Setter
@Getter
public class Adyacencia {
    private Vertice vertice;
    private double costo;
    
    public Adyacencia (Vertice vertice, double costo){
        this.vertice=vertice;
        this.costo=costo;
    }
    
}
