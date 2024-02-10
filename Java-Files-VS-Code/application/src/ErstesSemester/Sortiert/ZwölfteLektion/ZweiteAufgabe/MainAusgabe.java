package Sortiert.ZwölfteLektion.ZweiteAufgabe;
import java.util.Scanner;
public class MainAusgabe {
    public static void main(String[] args) {
        
        Baum baum = new Baum();
        Scanner scanner = new Scanner(System.in);
        int eingabe =-1;

        System.out.println("Wähle eine Option aus indem sie eine Nummer eingeben:\n1.Insertion\n2.Search\n3.Deletion\n4.Beendung des Programms");
        while (eingabe!=4) {
        System.out.print("Eingabe: ");
        eingabe = scanner.nextInt();


        if (eingabe==1) {
            System.out.println("\nEinfügung:");
            System.out.println("Gebe das hinzuzufügende Wort ein: ");
            String wort = scanner.next();
            System.out.println("Gebe die Definition ein: ");
            String bedeutung = scanner.next();
            baum.insert(wort, bedeutung );

        }

        if (eingabe==2) {
            System.out.println("\nSearch:");
            System.out.println("Gebe das gesuchte Wort ein: ");
            String wort = scanner.next();
            baum.search(wort);

        }

        if (eingabe==3) {
            System.out.println("\nDeletion");
            System.out.println("Gebe das gesuchte Wort ein: ");
            String wort = scanner.next();
            baum.delete(wort);

        }
        if (eingabe==4) return;

        System.out.println("\nAusgabe des Baums: ");
        baum.display();  
         

    }
   
   
            



    }
}
