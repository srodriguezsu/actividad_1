import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserte el número a evaluar: ");
        float numero = input.nextFloat();
        System.out.println(numero + " al cuadrado es " + Math.pow(numero, 2));
        System.out.println(numero + " al cubo es " + Math.pow(numero, 3));

    }
}