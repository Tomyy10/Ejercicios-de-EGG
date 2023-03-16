package ejerciciosjava;

//Llamos a la libreria de java mediante "Import" y utilizamos la utilidad "Scanner para ingresar datos por teclado;
import java.util.Scanner;

public class EjerciciosJAVA {
    
    public static void main(String[] args) {
        //Utilizamos la utilidad de java "Scanner" para que crear nuestro "leer" y poder ingresar valores por teclado;
        Scanner leer=new Scanner(System.in); 
        
        //Asignamos el tipo de dato de las variables a utilizar;
        int numero1;
        int numero2;
        
        //Mostramos al usuario un mensaje para que sepa que tendra que ingresar;
        System.out.println("Ingresar dos numeros enteros");
        
        //Utilizamos nextInt para ingresar valores enteros y next para ingersar cadenas;
        numero1=leer.nextInt(); 
        numero2=leer.nextInt();
        
        //Creamos una variable suma para almacenar dicho resultado y mostrarlo;
        int suma = numero1 + numero2;
        
        //Mostramos al usuario el resultado de dicha suma;
        System.out.println("La suma de los numeros ingresado es: " + suma);
    }
    
}
