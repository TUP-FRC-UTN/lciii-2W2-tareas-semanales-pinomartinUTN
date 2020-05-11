/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionbiblioteca;

/**
 *
 * @author Tincho
 */
public class Prestamo {
    private String solicitante;
    private int cantidadDias;
    private boolean devuelto;

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public Prestamo(String solicitante, int cantidadDias, boolean devuelto) {
        this.solicitante = solicitante;
        this.cantidadDias = cantidadDias;
        this.devuelto = devuelto;
    }
    
    public String toString(){
        return "Prestamo a : " +solicitante + "\n por "+cantidadDias +" dias \n" + "se encuentra devuelto?:  " +devuelto;
    }
}
