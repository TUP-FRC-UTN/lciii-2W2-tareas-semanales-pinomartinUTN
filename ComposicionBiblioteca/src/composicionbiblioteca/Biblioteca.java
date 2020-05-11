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
public class Biblioteca {
    private Libro [] libros;
    
    /*Constructor*/
    public Biblioteca(int cantidad){
        this.libros = new Libro[cantidad];
    }
    
    /*Metodo agrega Libro a array Libros*/
    public void agregarLibros(Libro libro){
        for (int i = 0; i < libros.length; i++) {
            if(libros[i] == null) {
                libros[i] = libro;
            }
        }
    }
    
    /*Metodo devuelve cantidad de Libros*/
    public int cantidadLibros(){
        int cantidad = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    /*/*Metodo devuelve un array con cantidad de Libros por Estado*/
   public int [] cantidadLibrosPorEstado(){
       int [] cantidadEstados = {0,0,0};
       for (int i = 0; i < libros.length; i++) {
           if(libros[i] != null ){
               switch(libros[i].getEstado()){
                   case 1 : 
                        cantidadEstados[0]++;
                        break;
                   case 2: 
                       cantidadEstados[1]++;
                       break;
                   case 3: 
                       cantidadEstados[2]++;
                       break;
               }
           }
       }
       return cantidadEstados;
   }
   
   /*Metodo con listado solicitantes por titulo de Libro*/
   public String listadoSolicitantes(String titulo){
       String listado= "";
       for (int i = 0; i < libros.length; i++) {
           if(libros[i] != null && libros[i].getTitulo().contains(titulo)){
           listado += " " + libros[i].listadoSolicitantes();
       }
       }
       return listado;
   }
   
   public double promedioPrestamos(){
       double promedio, acumulador = 0;
       for (int i = 0; i < libros.length; i++) {
           if(libros[i] != null){
           acumulador +=  libros[i].cantidadPrestamos();
       }
       }
       promedio = acumulador/libros.length;
       return promedio;
   }
   
   public double sumaPrecioExtraviados(){
       double sumaPrecios = 0;
       for (int i = 0; i < libros.length; i++) {
           if(libros[i] != null && libros[i].getEstado() == 3){
           sumaPrecios +=  libros[i].getPrecio();
       }
       }
       return sumaPrecios;
   }
   
   
}
