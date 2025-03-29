import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] arg) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el precio del primer producto");
        double prod1 = leer.nextDouble();

        System.out.println("Ingrse el precio del segundo producto");
        double prod2 = leer.nextDouble();

        System.out.println("Ingrese el precio del tercer producto");
        double prod3 = leer.nextDouble();

        double totalSinIva = (prod1 + prod2 + prod3);
        double  totalConIva = (totalSinIva * 0.22);

        System.out.println("El total sin iva es: " + totalSinIva);
        System.out.println("El total con iva es: " + totalConIva);








    }
}
