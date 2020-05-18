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
public class CajaAhorro extends Cuenta {

    public CajaAhorro(int numero,String nombre,double saldo) {
        super(numero, nombre, saldo);
    }
    
    
    @Override
  public void extraerMonto(double monto){
      if(getSaldo()>monto){
      double nuevoSaldo = 0;
      nuevoSaldo = this.getSaldo() - monto;
        setSaldo(nuevoSaldo);
      } else {
          System.out.println(mensajeErrorExtraccion());
          getSaldo();
      }
  }
}
