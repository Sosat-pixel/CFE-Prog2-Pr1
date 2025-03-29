import  java.util.Scanner; //Librería para pedir datos por consola al usuario
public class Apuntes {

    public static void main(String[] args) {

        //int - byte - long
        //Decimales = double - float
        //Boolean
        //char
        //String


        //Declarar
        Scanner leer = new Scanner(System.in); //Comando para leer por teclado
        int num;
        int num2;
        //Inicializar
        num = 7;
        num2 = 1;

        //Mostrar por pantalla
        System.out.println(num + num2);

        //sout = atajo para mostrar por pantalla


        //Ejemplo ingreso por teclado

        System.out.println("Ingrese el primer valor:");
        int num3 = leer.nextInt(); //.nextint() para ingresar el siguiente entero
        String nombre = leer.nextLine(); //.nextLine() para ingresar el siguiente texto


        System.out.println(("Ingrese el segundo valor"));
        int num4 = leer.nextInt();

        System.out.println("El resultado es: " + (num3 + num4));

        //Operadores
        // + Suma
        // - Resta
        // * Multiplicación
        // / División
        // % Módulo
        //Math.pow(a,b) Potencia
        //Math.sqt(a) Raiz Cuadrada

        //Operadores lógicos
        //&& == and
        //|| == or
        //! Not


    }

}