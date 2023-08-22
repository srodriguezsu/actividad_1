import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edJuan, edAlber, edAna, edMama ;
        System.out.print("Inserte la edad : ");
        edJuan = input.nextInt();
        edAlber = 2 * edJuan / 3;
        edAna = 4 * edJuan / 3;
        edMama = edJuan + edAlber + edAna;
        System.out.println("Las edades son: \n Alberto = " + edAlber + "\n Juan = " + edJuan + "\n Ana = " + edAna + "\n Mamá = " + edMama);
    }
}