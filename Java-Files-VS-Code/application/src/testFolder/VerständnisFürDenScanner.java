package testFolder;

import java.io.IOException;

public class VerständnisFürDenScanner  {
    public static void main (String[]args)throws IOException{ 
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char a = (char)scanner.nextInt();
        System.out.println(a); //-->Hier kommt was komplett anderes raus wie unten, weil die Ascii-Tabelle verwendet wird, deswegen das den unteren Code im Kommentar verwenden
        scanner.close();
        // char a = (char) System.in.read();
        // char b = (char) System.in.read();
        // System.out.println(a); //man wird also sozusagen nicht erneut aufgefordert was einzugeben sondern es wird einfach der nächste char wert genommen
        // System.out.println(b);

    }
}
