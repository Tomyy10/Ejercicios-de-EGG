//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
//Nota: investigar la función toUpperCase() y toLowerCase() en Java

package ejerciciosjava;

import java.util.Scanner;

public class EjerciciosJAVA3 {

    public static void main(String[] args) {
        
        //Utilizamos la utilidad de java "Scanner" para que crear nuestro "leer" y poder ingresar valores por teclado;
        Scanner leer = new Scanner(System.in);
        
        //Asignamos el tipo de dato a nuestras variables a utilizar;
        String frase;
        
        //Mostramos por pantalla al usuario que debera ingresar;
        System.out.print("Ingrese una frase: ");
        
        //Ingresara la frase mediante nuestro leer.next;
        frase = leer.next();
        
        //Estas variable "min" y "may" utilizo para la minuscula(.toLoweCase) y mayuscula(.toUpperCase);
        String min = frase.toLowerCase();
        
        String may = frase.toUpperCase();
        
        //Mostramos los mensajes al usuario 
        
        System.out.println("La frase en minuscula: " + min);
        
        System.out.println("La frase en mayuscula: " + may);
    }
    
}
