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
class Municipalidad {
    private Plan [] planes;
    
    /*Constructor que recibe el tamaño dado por usuario en Main*/
    public Municipalidad(int tamanio){
        
        this.planes = new Plan[tamanio];
    }
    
    //Metodo para agregar plan al array planes
    public void agregarPlan(Plan p){
        //Se pone el break para salir del break y para que no se llene el array de planes iguales
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] == null) {
                
                planes[i] = p;
                break;
            }
        }
    }
    
    //Dentro de este metodo usamos el metodo estaPagadoTotalmente() de la clase Plan , para validar.
    public int cantidadPlanesPagados(){
        int cantidad = 0;
        for (int i = 0; i < planes.length; i++) {
            if(planes[i] != null && planes[i].estaPagadoTotalmente()){
                
                    cantidad++;
            }
        }
        return cantidad;
    }
    
    public double promedioIntereses(){
        double promedio = 0;
        double acuIntereses = 0;
        int contadorPlanesNoVacios= 0;
         for (int i = 0; i < planes.length; i++) {
            if(planes[i] != null){
                
                    acuIntereses += planes[i].sumaInteresesCobrados();
                    contadorPlanesNoVacios++;
            }
        }
         
         promedio = acuIntereses/contadorPlanesNoVacios; 
        return promedio;
    }
    
}
