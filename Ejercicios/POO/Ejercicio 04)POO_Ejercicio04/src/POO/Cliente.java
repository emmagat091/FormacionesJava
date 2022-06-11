/*
 Hacer un programa sencillo para realizar gestiones en un banco para lo cual tendremos 2 clases(cliente y cuenta).
 Considerar que un cliente se caracteriza por su nombre, apellido y DNI.
 El cliente puede consultar saldo,como ingresar y retirar dinero de sus cuentas. Además cada cuenta
 se caracteriza por un número de cuenta y un saldo.
 
El cliente puede tener varias cuentas dentro del banco.

//Atributos:
-nombre,apellido,dni : String
cuentas []: Cuenta

//Métodos:
*Constructor Cliente
*Cuenta[] cuentas
*getDni,getApellid, getNombre :String
*consultar_saldo(int n) : double
*ingresar_dinero(int n,double cantidad) :void
*retirar_dinero(int n,double cantidad) :void


 */
package POO;

public class Cliente {

    //Atributos.
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];               //Es como se componen las cuentas,es un arreglo.

    //Método Constructor.

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }
    
    //Getters.
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    //Método consulta saldo.
    public double consultarSaldo(int n){                    // n es el indice, que referencia a la posición del arreglo.
       return cuentas[n].getSaldo();
    }

    //Método ingresar saldo.
    public void ingresar_Saldo(int n, double cantidad){
      cuentas[n].ingresarDinero(cantidad);
    }
   
    //Método retirar dinero.
    public void retirar_dinero(int m , double cantidad){
     cuentas[m].retirarDinero(cantidad);
    }
}
