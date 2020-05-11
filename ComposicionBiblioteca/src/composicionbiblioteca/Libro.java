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
public class Libro {
    private String titulo;
    private int precio;
    private int estado;
    private Prestamo [] prestamos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }
    
    

    public Libro(String titulo, int precio, int estado, int cantidad) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        this.prestamos = new Prestamo[cantidad];
    }
    
    /*Metodo para agregar prestamos al array*/
    public void agregarPrestamo(Prestamo pres){
        for (int i = 0; i < prestamos.length; i++) {
            if(prestamos[i] == null){
                prestamos[i] = pres;
                break;
            }
        }
    }
    
    /*Metodo devuelve solicitantes de cierto Libro*/
    public String listadoSolicitantes(){
        String listado = "";
        for (int i = 0; i < prestamos.length; i++) {
            if(prestamos[i] != null){
               listado += prestamos[i].getSolicitante() +" ";
            }
        }
        return listado;
    }
    
     /*Metodo devuelve cantidad de prestamos  de cierto Libro*/
    public int cantidadPrestamos(){
        int cantidad = 0;
         for (int i = 0; i < prestamos.length; i++) {
            if(prestamos[i] != null){
               cantidad ++;
            }
        }
         return cantidad;
    }
    
}
