/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

/**
 *
 * @author Tincho
 */
class Pago {
    private int demora;
    private double importe;
    private double interesesAdic;

    /*Setter y Getters*/
    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getInteresesAdic() {
        return interesesAdic;
    }

    public void setInteresesAdic(double interesesAdic) {
        this.interesesAdic = interesesAdic;
    }
    
    public Pago(){
        this.demora = 0;
        this.importe = 0;
        this.interesesAdic = 0;
    }
    
    public Pago(int demora, double importe, double interesesAdicionales){
        this.demora = demora;
        this.importe = importe;
        this.interesesAdic = interesesAdicionales;
    }
    
    public String toString(){
        return "El pago tiene Demora de: " +demora + "\n un importe de: " +importe + "\n y con intereses adicionales de: " +interesesAdic;
    }
}
