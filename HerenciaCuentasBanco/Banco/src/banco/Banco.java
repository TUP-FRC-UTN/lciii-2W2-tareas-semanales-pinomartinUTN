/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Tincho
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CtaCorriente c1 = new CtaCorriente(1, "hola", 1000,-100);
        c1.depositarMonto(1000);
        c1.extraerMonto(1200);
        System.out.println(c1.toString());
        
      
        
    }
    
}
