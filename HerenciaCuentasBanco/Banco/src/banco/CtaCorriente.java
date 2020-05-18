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
public class CtaCorriente extends Cuenta {
    private double acuerdo;

public CtaCorriente(int numero,String nombre,double saldo,double acuerdo){
    super(numero, nombre, saldo);
    this.acuerdo = acuerdo;
}

    @Override
    public void extraerMonto(double monto){
    double nuevoSaldo = 0;
    if((this.getSaldo()-monto) >= acuerdo){
        nuevoSaldo = getSaldo()-monto;
    }else{
        System.out.println(mensajeErrorExtraccion());
        nuevoSaldo = getSaldo();
    }
   this.setSaldo(nuevoSaldo);
}
    
  
   
}
