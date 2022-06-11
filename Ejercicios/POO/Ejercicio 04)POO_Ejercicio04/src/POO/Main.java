/*
 Hacer un programa sencillo para realizar gestiones en un banco para lo cual tendremos 2 clases(cliente y cuenta).
 Considerar que un cliente se caracteriza por su nombre, apellido y DNI.
 El cliente puede consultar saldo,como ingresar y retirar dinero de sus cuentas. Además cada cuenta
 se caracteriza por un número de cuenta y un saldo.
 */
package POO;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Main {

    public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {     //n es el némero de la cuenta.
        int i = 0;
        int indice = 0;

        boolean encontrado = false;         //sirve para saber si encontro o no el número.

        //Búsqueda secuencial.
        while ((i < cuentas.length) && (encontrado == false)) {
            if (cuentas[i].getNroCuenta() == n) //Si el número de cuenta en el que vamos, es igual al número de cuenta que estamos búscando. 
            {
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, dni;
        int nroCuenta, cuentasUsuario;                  //CuentasUsuario, es la cantidad de cuentas que tiene el usuario en el banco.
        int opcion, indiceCuenta;               //Sirve para que el usuario eleja entre las opciones del menú.    
        double saldo, cantidad;

        Cuenta cuentas[];

        Cliente cliente;                                //Creamos el objecto sin inicializarlo.

        //Ingreso de información del cliente.
        System.out.print("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Digite el apellido del cliente: ");
        apellido = entrada.nextLine();
        System.out.print("Digite el DNI del cliente: ");
        dni = entrada.nextLine();
        System.out.print("Digite cuantas cuentas tiene el usuario en el banco: ");  //Indicamos la cantidad de cuentas del usuario dentro del banco.
        cuentasUsuario = entrada.nextInt();

        //Creamos el número de cuentas del usuario.
        cuentas = new Cuenta[cuentasUsuario];                   //Indicamos la cantidad de cuentas que va a tener el usuario.

        //Formamos el arreglo de la cuenta, como se encuentra "conformada" a nivel datos.
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Digite los datos para la cuenta " + (i + 1) + ":");
            System.out.print("Digite el número de cuenta ");
            nroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();

            cuentas[i] = new Cuenta(nroCuenta, saldo);                          //Sirva para ir guardamos las cuentas, a medida que avanza el bucle FOR.
                                                                                // el iterador indicar las cuentas que corresponden.
        }

        //Inicializamos el objecto "Cliente".
        cliente = new Cliente(nombre, apellido, dni, cuentas);                 //inicializamos el cliente.

        //Menú para las opciones a elegir por el cliente.
        do {
            System.out.println("\t.:Menú:.");
            System.out.println("1. Ingresar dinero en la cuenta. ");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar dinero de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Digite la opción del menú ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nDigite el número de la cuenta: ");
                    nroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, nroCuenta);          //almacena el resultado.

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado NO existe. ");

                    } else {
                        System.out.print("\nDigite la cantidad de dinero a ingresar: ");
                        cantidad = entrada.nextDouble();                                       //Es la cantidad de dinero que deseo ingresar.

                        cliente.ingresar_Saldo(indiceCuenta, cantidad);
                        System.out.println("\nIngreso realizado correctamente , saldo disponible: " + cliente.consultarSaldo(indiceCuenta));

                    }
                    break;
                case 2:
                    System.out.println("\nDigite el número de la cuenta: ");
                    nroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, nroCuenta);          //almacena el resultado.

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado NO existe. ");

                    } else {
                        System.out.println("\nDigite la cantidad de dinero a retirar");
                        cantidad = entrada.nextDouble();
                        if (cantidad > cliente.consultarSaldo(indiceCuenta)) {
                            System.out.println("Saldo insuficiente. ");
                        } else {
                            cliente.retirar_dinero(indiceCuenta, cantidad);
                            System.out.println("\nRetiro realizado correctamente");
                            System.out.println("saldo disponible: " + cliente.consultarSaldo(indiceCuenta));
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nDigite el número de la cuenta: ");
                    nroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, nroCuenta);          //almacena el resultado.

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado NO existe. ");

                    } else {
                        System.out.println("saldo disponible: " + cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error se confundio de opción de menú ");
            }
            System.out.println("");
        } while (opcion != 4);

    }

}
