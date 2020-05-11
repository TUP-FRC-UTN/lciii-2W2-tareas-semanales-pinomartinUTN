/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionbiblioteca;

import java.util.Scanner;

/**
 *
 * @author Tincho
 */
public class ComposicionBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Libros que posee: ");
        Biblioteca biblio1 = new Biblioteca(sc.nextInt());
        
    }
    
}
