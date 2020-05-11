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
public class Producto {
    private String descripcion;
    private Material materiales[];

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMateriales(Material[] materiales) {
        this.materiales = materiales;
    }
    
    /*Constructor con parametros*/
    public Producto(String desc,int cantidadMat){
        this.descripcion = desc;
        this.materiales = new Material[cantidadMat];
    }
    
    /*Metodo para agregar Materiales al array materiales*/
    public void agregarMateriales(Material material){
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] == null){
                materiales[i] = material;
                break;
            }
        }
    }
    
    /*Metodo que calcula el Costo Total de todos los costos unitarios de materiales que componen un Producto*/
    public double calcularCostoTotal(){
        double costo = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null){
                costo += materiales[i].getValorUnitario();
            }
        }
        return costo;
    }
    
    /*Metodo que consulta  por codigo la existencia de un Material en un Producto*/
    public boolean existeMaterial(int codigo){
        boolean existe = false;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null && materiales[i].getCodigo() == codigo){
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    /*Metodo que retorna un vector con materiales con Valor Unitario menor a Param*/
    public String [] materialMenorQue(double valor){
        String [] mat = new String[materiales.length] ;
        int cantidad = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null && materiales[i].getValorUnitario()<valor){
                mat[cantidad] = materiales[i].getDescripcion();
                cantidad++;
            }
        }
        return mat;
    }
    
    /*Metodo que retorna un vector con cantidad de Materiales segun rango de precios*/
    public int [] rangoPrecios(){
        int [] precios = {0,0,0,0};
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null){
                if(materiales[i].getValorUnitario() <= 10){
                    precios[0]++;
                }else if(materiales[i].getValorUnitario() > 10 && materiales[i].getValorUnitario() <= 20){
                    precios[1]++;
                }else if(materiales[i].getValorUnitario() > 20 && materiales[i].getValorUnitario() <= 30){
                    precios[2]++;
                    
                }else precios[3]++;
            }
        }
        return precios;
    }
}
