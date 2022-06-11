/*
 Constuir un programa para trabajar con 2 números complejos , implemente el siguiente menú.
 
 1. Sumar dos números complejos.
 2. Multiplicar 2 números complejos.
 3. Comparar 2 números complejos (iguales o no).
 4. Multiplicar un número complejo por uno entero.
 */
package POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Atributos.
        double a, b, c, d;              //Valores para números Reales e Imaginarios.
        int opcion = 0;                 //Opción que selecciona el usuario.
        int numEntero;

        //Objetos, los definimos pero , no los inicializamos, se inicializan dentro del Swich "Case".

        Numero_Complejos num1, num2, suma, multp;

        do {
            System.out.println("\t.:Menú operaciones números complejos:. ");
            System.out.println("1. Sumar dos números complejos. ");
            System.out.println("2. Multiplicar 2 números complejos. ");
            System.out.println("3. Comparar 2 números complejos (iguales o no). ");
            System.out.println("4. Multiplicar un número complejo por uno entero. ");
            System.out.println("5. Salir. ");
            System.out.print("\nIngrese una opción de menú ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nDigite el primer número complejo ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("\nDigite el segundo número complejo ");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    //Objectos --> los inicializamos, se declararon más arriba.
                    num1 = new Numero_Complejos(a, b);
                    num2 = new Numero_Complejos(c, d);

                    suma = num1.sumaComplejos(num2);
                    System.out.println("\nLa suma es: " + suma.getA() + " + " + suma.getB() + "i");
                    break;

                case 2:
                    System.out.println("\nDigite el primer número complejo ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("\nDigite el segundo número complejo ");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    //Objectos --> los inicializamos, se declararon más arriba.
                    num1 = new Numero_Complejos(a, b);
                    num2 = new Numero_Complejos(c, d);

                    multp = num1.multiplicacionComplejos(num2);
                    System.out.println("\nLa Multiplicacion es: " + multp.getA() + " + " + multp.getB() + "i");
                    break;

                case 3:
                    System.out.println("\nDigite el primer número complejo ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("\nDigite el segundo número complejo ");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    //Objectos --> los inicializamos, se declararon más arriba.
                    num1 = new Numero_Complejos(a, b);
                    num2 = new Numero_Complejos(c, d);

                    if (num1.igualdadComplejos(num2)) {
                        System.out.println("\nLos números complejos son iguales");
                    } else {
                        System.out.println("\nLos números complejos NO son iguales");
                    }
                    break;

                case 4:
                    System.out.println("\nDigite el primer número complejo ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.print("Digite el número entero ");
                    numEntero = entrada.nextInt();

                    //Objectos --> los inicializamos, se declararon más arriba.
                    num1 = new Numero_Complejos(a, b);

                    multp = num1.multiplicacion(numEntero);
                    System.out.println("\nLa Multiplicacion resultante es: " + multp.getA() + " + " + multp.getB() + "i");
                    break;
                case 5:
                    break;
            }
            System.out.println("");
        } while (opcion != 5);

    }
}
