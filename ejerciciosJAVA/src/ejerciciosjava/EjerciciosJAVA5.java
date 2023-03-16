//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
//el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().

package ejerciciosjava;

import java.util.Scanner;

public class EjerciciosJAVA5 {

    public static void main(String[] args) {
        
       //Utilizamos la utilidad de java "Scanner" para que crear nuestro "leer" y poder ingresar valores por teclado;
        Scanner leer = new Scanner(System.in);
        
        ///Asignamos el tipo de dato a nuestras variables a utilizar
        int numero, raiz;
        
        ///Mostramos el mensaje por pantalla al usuario
        System.out.print("Ingresar un numero entero: ");
        
        ///Ingresa el numero
        numero = leer.nextInt();
        
        ///En esta operacion realizaremos el doble de ese numero
        int doble = numero * 2;
        
        ///Es lo mismo de la anterior por con la diferencia que pedimos el triple
        int triple = numero * 3;
        
        ///utilizamos la funcion "Math.sqrt" para hallar la raiz cuadrada de nuestro numero
        raiz = (int) Math.sqrt(numero);
        
        ///Mostramos todos los resultados al usuario 
        System.out.println("El doble del numero ingresado es: " + doble);
        
        System.out.println("El triple del numero ingresado es: " + triple);
        
        System.out.println("La raiz del numero ingresado es: " + raiz);
        
        
        
    }
    
}
