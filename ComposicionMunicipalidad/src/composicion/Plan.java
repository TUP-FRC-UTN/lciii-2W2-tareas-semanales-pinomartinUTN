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
class Plan {
    private String nombre;
    private double deuda;
    private int cuotas;
    private Pago [] pagos;

    //Se excluye al array del constructor, para que no haya inconvenientes, la cantidad de pagos del plan va a ser igual a la cantidad de cuotas.
    public Plan(String nombre, double deuda, int cuotas) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        //IMPORTANTE inicializar el array para evitar la excepcion
        this.pagos = new Pago[cuotas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    /*Se elimina el getPagos, ya que no va ser necesario
    */
    public void setPagos(Pago[] pagos) {
        this.pagos = pagos;
    }
    
        //Metodo para agregar Pagos al array pago
       public void agregarPago(Pago pago){
        //Se pone el break para salir del break y para que no se llene el array de pagos iguales
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                
                pagos[i] = pago;
                break;
            }
        }
    }
    
       //Si no encuentra lugares vacios en el array de pagos, asumimos que esta pago totalmente.
    public boolean estaPagadoTotalmente(){
        boolean estaPago= true;
        for (int i = 0; i < pagos.length; i++) {
            if(pagos[i] == null ){
                
                estaPago = false;
                break;
            }
            
        }
        return estaPago;
    }
    
    
    public double sumaInteresesCobrados(){
        double sumaIntereses= 0;
        
        for (int i = 0; i < pagos.length; i++) {
           if(pagos[i] != null){
               if(pagos[i].getDemora() >0){
                   
                   sumaIntereses += pagos[i].getDemora() * pagos[i].getInteresesAdic() * pagos[i].getImporte();
               }
           }
            
        }
        return sumaIntereses;
    }
}
