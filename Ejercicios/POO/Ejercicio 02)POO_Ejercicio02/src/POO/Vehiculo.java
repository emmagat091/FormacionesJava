/*
  Construir un programa que, dada una serie de vehículos caracterizados por su marca, modelo y precio , imprima las 
  propiedades del vehículo más barato. Para ello, se deberán leer por teclado las características de cada vehículo
  y crear una clase que represente a cada uno de ellos.
 */
package POO;

public class Vehiculo {

    private String marca,modelo;
    private float precio;

    //Constructor Clase.
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;   
     }

    public float getPrecio() {              //Muestra el precio.
        return precio;
    }
  
    public String mostrarDatos (){          //Muestra los datos.
       return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio USD: "+precio+"\n";
    }

}

