/*
  Una empresa de envío de paquetes tiene varias sucursales en todo el país . cada sucursal esta definida por su
  número de sucursal, dirección y ciudad. para calcular el precio que cuesta enviar cada paquete, las sucursales tienen
  en cuenta el precio del paquete y la prioridad , sabiendo que se cobra un dólar por KG, 10 dólares más si la prioridad es alta
  y 20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía.
 */
package POO;

public class Paquete {

    //Atributos.
    private double peso;
    private int nroPaquete, prioridad;
    private String dni;

    //Método constructor.
    public Paquete(double peso, int nroPaquete, int prioridad, String dni) {
        this.peso = peso;
        this.nroPaquete = nroPaquete;
        this.prioridad = prioridad;
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getNroPaquete() {
        return nroPaquete;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getDni() {
        return dni;
    }

    //Método informacion del paquete.
    public String mostrarDatosPaquete() {
        return ("\nInformacion del paquete: " 
              + "\nNro Paquete: " + nroPaquete 
              + "\nDNI emisor: " + dni 
              + "\nPeso :" + peso
              + "\nPrioridad entraga: +  prioridad");
    }

}
