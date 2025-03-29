import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base");
        double base = leer.nextDouble();

        System.out.println("Ingrese la altura");
        double altura = leer.nextDouble();

        System.out.println("El área es: " + (base * altura));

    }
}
