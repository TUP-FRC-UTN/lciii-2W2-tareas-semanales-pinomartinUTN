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
public class Material {
    private int codigo;
    private String descripcion;
    private double valorUnitario;
    
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int cod){
        this.codigo = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public Material(){
        this.codigo = 0;
        this.descripcion = "";
        this.valorUnitario = 0;
    }

    public Material(int codigo, String descripcion, double valorUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
    }
    
    
}
