/*
  Construir un programa que, dada una serie de vehículos caracterizados por su marca, modelo y precio , imprima las 
  propiedades del vehículo más barato. Para ello, se deberán leer por teclado las características de cada vehículo
  y crear una clase que represente a cada uno de ellos.
 */
package POO;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Main {

    //Determinar el coche más barato.
    public static int indiceCocheMasBarato(Vehiculo coches[]) {       //El tipo de dato, es de la clase, Vehiculo y el parametro le pasamos el arreglo coches[].
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();                   //Precio Inicial - almacena el "primer precio" del primer coche.
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos;          //Cantidad de vehículos que el usuario defina.
        int indiceMB;                 //Indice del vehículo más barato.

        //Expresamos la cantidad de coche que queremos.
        System.out.print("Digite la cantidad de vehículos: ");
        numeroVehiculos = entrada.nextInt();

        //Definimos el/los objectos.
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        //Cargamos los datos al objecto.
        for (int i = 0; i < coches.length; i++) {            //puede ser n<numeroVehiculos , o coche.length
            entrada.nextLine();
            System.out.println("\nDigité las características del Coche " + (i + 1) + ": ");
            System.out.print("Introduzca Marca: ");
            marca = entrada.nextLine();             //nextLine() sirve para clases extensas.
            System.out.print("Introduzca Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca el precio USD: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);       //Sirve para cada vez que de una vuelta el bucle, se rellena la información y lo almacena en cada coche.

        }
        indiceMB = indiceCocheMasBarato(coches);                  //Indice del coche más barato.

        //Mostramos el coche más barato.
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceMB].mostrarDatos());
    }
}
