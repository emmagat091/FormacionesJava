/*
  Una empresa de envío de paquetes tiene varias sucursales en todo el país . cada sucursal esta definida por su
  número de sucursal, dirección y ciudad. para calcular el precio que cuesta enviar cada paquete, las sucursales tienen
  en cuenta el precio del paquete y la prioridad , sabiendo que se cobra un dólar por KG, 10 dólares más si la prioridad es alta
  y 20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía.


  -Menu de opciones : 
     *System.out.println("\t.:Menú Opciones:. ");
            1. Crear una nueva sucursal
            2. Enviar paquete
            3. Consultar sucursal
            4. Consultar paquete
            5. Mostrar todas las sucursales
            6. Mostrar todos los paquetes
            7. Salir
     

 */
package POO;

import java.util.Scanner;

public class Main {

    //Método búsqueda de paquetes. --> Búsqueda Secuencial.
    public static int buscarPaquete(Paquete p[], int nroPaquete, int contadorPaquete) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < contadorPaquete; i++) {
            if (p[i].getNroPaquete() == nroPaquete) {
                encontrado = true;
                indice = i;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }

        return indice;

    }

    //Método de búsqueda secuencial de la sucursal.
    public static int buscarSucursal(Sucursal t[], int numSucursal, int contadorSucursal) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < contadorSucursal; i++) {
            if (t[i].getNumSucursal() == numSucursal) {
                encontrado = true;
                indice = i;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }

        return indice;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Atributos.
        int nroPaquete, numSucursal, prioridad, opcion;
        String dni, direccion, ciudad;
        double peso, precioPaquete;

        int contadorSucursal = 0, indiceSucursal;
        int contadorPaquete = 0, indicePaquete;

        //Creamos objetos.
        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];

        //Menú de opciones.
        do {
            System.out.println("\t.:Menú Opciones:. ");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");
            System.out.print("Digite la opcion del menú: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nDigite el número de la sucursal: ");
                    numSucursal = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Digite la direccion de la sucursal: ");
                    direccion = entrada.nextLine();
                    System.out.print("Digite la ciudad de la sucursal: ");
                    ciudad = entrada.nextLine();

                    //creamos el arreglo de la sucursal.
                    sucursal[contadorSucursal] = new Sucursal(numSucursal, direccion, ciudad);             //Sirve para crear una nueva sucursal.
                    contadorSucursal++;
                    break;

                case 2:
                    System.out.print("\nDigite el número de la sucursal: ");
                    numSucursal = entrada.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, numSucursal, contadorSucursal);

                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe");
                    } else {
                        System.out.print("\nDigite el número del paquete: ");
                        nroPaquete = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("\nDigite el DNI de la persona que envia el paquete: ");
                        dni = entrada.nextLine();
                        System.out.print("\nDigite el peso del paquete: ");
                        peso = entrada.nextDouble();
                        System.out.println("\nDigite la prioridad de envio del paquete: (0 =normal , 1 =alta , 2 =express): ");
                        prioridad = entrada.nextInt();

                        paquete[contadorPaquete] = new Paquete(peso, nroPaquete, prioridad, dni);

                        precioPaquete = sucursal[indiceSucursal].precioEnvioPaquete(paquete[contadorPaquete]);
                        System.out.println("\nEl precio del envio es: " + precioPaquete + " USD.");
                        contadorPaquete++;
                    }
                    break;

                case 3:
                    System.out.print("\nDigite el número de la sucursal: ");
                    numSucursal = entrada.nextInt();

                    indiceSucursal = buscarSucursal(sucursal, numSucursal, contadorSucursal);
                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe");
                    } else {
                        System.out.println("\nLos datos de la sucursal son: ");
                        System.out.println(sucursal[indiceSucursal].informacionSucursal());
                    }
                    break;
                case 4:
                    System.out.println("\nDigite el número de paquete:");
                    nroPaquete = entrada.nextInt();
                    indicePaquete = buscarPaquete(paquete, nroPaquete, contadorPaquete);
                    if (indicePaquete == -1) {
                        System.out.println("El paquete no existe");
                    } else {
                        System.out.println("\nLos datos del pequete son: ");
                        System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    break;
                case 5:
                    for (int i = 0; i < contadorSucursal; i++) {
                        System.out.println("\nLos datos de la sucursal n° " + (i + 1) + "son:");
                        System.out.println(sucursal[i].informacionSucursal());

                    }
                    break;

                case 6:
                    for (int i = 0; i < contadorSucursal; i++) {
                        System.out.println("\nLos datos del paquete: " + (i + 1) + "son : ");
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    break;
                case 7:
                    break;

            }

            System.out.println("");
        } while (opcion != 7);

    }
}
