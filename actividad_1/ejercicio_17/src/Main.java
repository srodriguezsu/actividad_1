import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radio, area, longitud;
        System.out.print("Radio: ");
        radio = input.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;
        System.out.println("El area del círculo es: " + area +
                "\nLa longitud de la circunferencia es: " + longitud);
    }
}