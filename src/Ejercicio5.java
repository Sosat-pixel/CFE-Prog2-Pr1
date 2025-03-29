import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] arg) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en celcius");
        double celcius = leer.nextDouble();

        double farenheit = (celcius * 9/5) + 32;
        System.out.println(celcius + " Celcius " + " son " + farenheit + " grados farenheit");







    }
}
