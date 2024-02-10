package Sortiert.NeuesKlausurübungsaufgaben;
import java.util.Scanner;
public class scannersTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int zahl = scanner.nextInt();
        scanner.nextLine();
        String text = scanner.nextLine();

        System.out.println("Zahl: " + zahl);
        System.out.println("Text: " + text);

        scanner.close();
    }
}
