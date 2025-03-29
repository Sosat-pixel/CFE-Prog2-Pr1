import java.util.Scanner;
public class Ejercicio7 {
    public  static void main(String[] arg) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = leer.nextInt();

        System.out.println("Ingrese su ciudad");
        leer.nextLine();
        String ciudad = leer.nextLine();


        System.out.println("Hola " + nombre + " tienes " + edad + " y vives en " + ciudad );







    }
}
