package Sortiert.FünfteLektion;
import java.util.Scanner;;
public class PiRichtig {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        int vierecke = scanner.nextInt();
        double unterschied = 0;
        double breite = 1.0/vierecke;
        double höhe = 1 - unterschied;
        double flächeErstesViereck = (höhe * breite);



        
        

        scanner.close();

    }
}
