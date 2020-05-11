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
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanio= 0;
        Municipalidad muni = new Municipalidad(tamanio);
        
        //Carga de los datos por el usuario
        Plan p = new Plan("Pino Martin", 15000, 3);
        //agregamos el plan con el metodo agregarPlan de Municipalidad
        muni.agregarPlan(p);
        
        System.out.println("La cantidad de Planes pagados totalmente es de " +muni.cantidadPlanesPagados());
        System.out.println("El Promedio de intereses pagados por los contribuyentes es de: " +muni.promedioIntereses());
    }
    
}
