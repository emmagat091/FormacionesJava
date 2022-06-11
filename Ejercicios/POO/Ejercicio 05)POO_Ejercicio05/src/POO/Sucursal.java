/*
  Una empresa de envío de paquetes tiene varias sucursales en todo el país . cada sucursal esta definida por su
  número de sucursal, dirección y ciudad. para calcular el precio que cuesta enviar cada paquete, las sucursales tienen
  en cuenta el precio del paquete y la prioridad , sabiendo que se cobra un dólar por KG, 10 dólares más si la prioridad es alta
  y 20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía.
 */
package POO;

public class Sucursal {

    //Atributos.
    private int numSucursal;
    private String direccion, ciudad;

    //Constructor.
    public Sucursal(int numSucursal, String direccion, String ciudad) {
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;

    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    //Método información sucursal.
    public String informacionSucursal() {
        return ("\nInformación sucursal: " 
                + "\nNúmero Sucursal: " + numSucursal 
                + "\nDireccion: " + direccion 
                + "\nCiudad: " + ciudad);
    }

    //Método calcular precio envio paquete.
    public double precioEnvioPaquete(Paquete t) {
        double precio;
        precio = t.getPeso();           //en caso de prioridad normal.
        if (t.getPrioridad() == 1) {
            precio += 10;

        }
        if (t.getPrioridad() == 2) {
            precio += 20;
        }
        return precio;
    }

}
