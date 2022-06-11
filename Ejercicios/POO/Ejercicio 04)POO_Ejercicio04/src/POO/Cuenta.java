/*
 Hacer un programa sencillo para realizar gestiones en un banco para lo cual tendremos 2 clases(cliente y cuenta).
 Considerar que un cliente se caracteriza por su nombre, apellido y DNI.
 El cliente puede consultar saldo,como ingresar y retirar dinero de sus cuentas. Además cada cuenta
 se caracteriza por un número de cuenta y un saldo.
 
//Atributos:

-numero cuenta : int
-saldo : double

//Métodos.
*Constructor (nro cuenta / saldo)
*getNumero/getSaldo
*ingresarSaldo(double cantidad):void
*retirarSaldo(double cantidad): void
 */
package POO;

public class Cuenta {
    //Atributos.

    private int nroCuenta;
    private double saldo;

    //Método constructor.
    public Cuenta(int nroCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    //Getters.
    public int getNroCuenta() {
        return nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Método ingresar dinero. 
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    //Método retirar dinero.
    public void retirarDinero(double cantidad) {
        saldo -= cantidad;
    }

}
