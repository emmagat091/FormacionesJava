/*
 Construir un programa que calcule el área y el perímetro de un cuadrilatero dad la longitud de sus dos lados.
 Los valores de la longitud deberán introducirse por línea de ordenes. 
 Si es un cuadrado , sólo se proporcionará la longitud de uno de los lados al constructor.
 */
package AreaPerimetroTriangulo;

public class Cuadrilatero {

    //Atributo.
    private float lado1;
    private float lado2;

    //Métodos.

    //Método Constructor 1 --> Cuadrilatero.
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Método Constructor 2 --> Cuadrado.
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    //Método para el perimetro.
    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public float getArea() {
        float area = (lado1 * lado2);
        return area;
    }

}
