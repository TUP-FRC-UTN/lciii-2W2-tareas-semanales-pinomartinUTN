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
public abstract class Cuenta {
    private int numero;
    private String nombre;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta(int numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    
    public abstract void extraerMonto(double monto); //abstract OBLIGA A QUE SE HAGA OVERRIDE en las CLASES HIJAS
        
   
    
    public  void depositarMonto(double monto){
        this.saldo +=monto;
    }
    
     public String mensajeErrorExtraccion(){
       return "El monto a extraer supera su saldo o  limite acordado";
   }
     
    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo= $ " + saldo + '}';
    }
    
    
}
