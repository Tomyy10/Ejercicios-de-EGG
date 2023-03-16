//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
//La fórmula correspondiente es: F = 32 + (9 * C / 5).
package ejerciciosjava;

import java.util.Scanner;

public class EjerciciosJAVA4 {
    
    public static void main(String[] args) {
       
        //Utilizamos la utilidad de java "Scanner" para que crear nuestro "leer" y poder ingresar valores por teclado;
        Scanner leer = new Scanner(System.in);
        
        //Asignamos el tipo de dato a nuestras variables a utilizar;
        int grados;
        
        //Mostramos el mensaje al usuario;
        System.out.print("Ingresar los grados: ");
        
        //Ingresara por teclado los grados y utilizamos "nextInt", en remplazo de "next";
        //ya que "next" se utiliza en variables "String" y "nextInt" ya como las 3 letras al final para numeros;
        grados = leer.nextInt();
        
        ///creamos una variable y en ella misma realizamos la operacion para mostrar la equivalencia;
        int Fahrenheit = 32 + (9 * grados / 5);
        
        //Mostramos los grados ingresados por el usuario y la equivalencia;
        System.out.println("Los grados son: " + grados + "°C");
        
        System.out.println("Los grados equivalentes a Fahrenheit son: " + Fahrenheit + "°F");
        
        
        
    }
    
}
