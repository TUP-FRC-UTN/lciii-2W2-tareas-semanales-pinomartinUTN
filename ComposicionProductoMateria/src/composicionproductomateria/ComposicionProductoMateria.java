/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionproductomateria;


/**
 *
 * @author Tincho
 */
import java.util.Arrays;
public class ComposicionProductoMateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto p = new Producto("Caño", 4);
        Material m1 = new Material(1, "plastico", 50);
        Material m2 = new Material(2, "Pintura", 30);
        Material m3 = new Material(3, "cola", 15);
        Material m4 = new Material(4, "Polietileno", 5);
        
        p.agregarMateriales(m1);
        p.agregarMateriales(m2);
        p.agregarMateriales(m3);
        p.agregarMateriales(m4);
        
     
        System.out.println(Arrays.toString(p.materialMenorQue(3)));
        System.out.println(Arrays.toString(p.rangoPrecios()));
    }
    
}
