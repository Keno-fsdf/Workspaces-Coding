import java.util.Scanner;
public class Pizzarechner_Vorstellbar {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie den Durchmesser der ersten Pizza ein: "); //Durchmesser der ersten Pizza
        double durchmesserEins = scanner.nextDouble(); //double, weil der durchmesser auch eine Kommazahl sein kann
        System.out.println("Geben sie den Preis der ersten Pizza ein: "); //Anweisung an den Benutzer
        double preisEins = scanner.nextDouble();   //Preis der ersten Pizza
        //Das gleiche nochmal für die zweite Pizza

        System.out.println("\nGeben sie den Durchmesser der zweiten Pizza ein: "); // das \n für die bessere Übersicht
        double durchmesserZwei = scanner.nextDouble();
        System.out.println("Geben sie den Preis der zweite Pizza ein: "); //Anweisung an den Benutzer
        double preisZwei = scanner.nextDouble();

        //Berechnung der Fläche der Pizzen

        
        double flächeEins = durchmesserEins *Math.PI; //Berechnet die Fläche der Pizza
        double flächeZwei = durchmesserZwei *Math.PI;
        
        double plVEins = flächeEins/preisEins; //plVEins = preisLeisungsVerhälntnisEins -->Von der ersten Pizza
        double plVZwei = flächeZwei/preisZwei;

        if (plVEins>plVZwei) System.out.println("\nDie erste Pizza hat ein besseres Preisleistungs-Verhältnis");
        else System.out.println("\nDie zweite Pizza hat ein besseres Preisleistungs-Verhältnis");


        
        scanner.close();
    }
    
}
