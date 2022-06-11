
/*
 Constuir un programa para trabajar con 2 números complejos , implemente el siguiente menú.
 
 1. Sumar dos números complejos.
 2. Multiplicar 2 números complejos.
 3. Comparar 2 números complejos (iguales o no)
 4. Multiplicar un número complejo por uno entero.
 */
package POO;

public class Numero_Complejos {

    private double a, b;

    //Método constructor.
    public Numero_Complejos(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //Método Getters--> para mostrar los valores.
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    //Método suma número complejos --> El resultado es un Número complejo.
    public Numero_Complejos sumaComplejos(Numero_Complejos c) {

        //Se define un obj nuevo, para reprensentar el resultado , de las interacciones nuevas.
        
        Numero_Complejos suma = new Numero_Complejos(a + c.getA(), b + c.getB());
        return suma;
    }

    //Método multiplicacion número complejo --> El resultado es un Número complejo.
    public Numero_Complejos multiplicacionComplejos(Numero_Complejos c) {
        Numero_Complejos mult = new Numero_Complejos((a * c.getA() - b * c.getB()), (a * c.getB() + b * c.getA()));
        return mult;
    }

    //Método igualdad complejos --> Resultado Booleano (True/False).
    public boolean igualdadComplejos(Numero_Complejos c) {
        boolean iguales = false;
        if ((a == c.getA()) && (b == c.getB())) {
            iguales = true;
        }
        return iguales;
    }

    //Método multiplicar complejo por entero --> El resultado es un Número complejo.
    public Numero_Complejos multiplicacion(int x) {
        Numero_Complejos mult = new Numero_Complejos(a * x, b * x);
        return mult;
    }
}
