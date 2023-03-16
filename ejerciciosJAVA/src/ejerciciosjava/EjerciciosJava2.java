//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

package ejerciciosjava;

import java.util.Scanner;

public class EjerciciosJava2 {

    public static void main(String[] args) {
        
        //Utilizamos la utilidad de java "Scanner" para que crear nuestro "leer" y poder ingresar valores por teclado;
        Scanner leer = new Scanner(System.in);
        
        //Asignamos el tipo de dato de las variables a utilziar;
        String nombre;
      
        //Mostramos al usuario el mensaje de que va a ingresar;
        System.out.print("Ingrese tu nombre: ");
        
        //esta variable se utiliza para almacenar el dato ingresado por el usuario;
        nombre = leer.nextline();
        
        //Mostramos el mensaje al usuario del resultado;
        System.out.println("Hola " + nombre + " ¿Como estas");
    }
    
}
