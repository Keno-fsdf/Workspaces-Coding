package Sortiert.ExtraÜbungsaufgaben;

import java.util.Scanner;

public class NotenskalaRefactoring {

        public static void main (String[]args) {
    System.out.println("Bitte geben Sie ihre Punktzahl ein:");
    Scanner scanner = new Scanner(System.in);
    double punktzahl = scanner.nextDouble(); //double Scanner, weil wir ja auch 0,5 werte entgegennehmen wollen
    System.out.println();
    boolean erlaubteNachkommastelle = true; //initalisierung von zwei boolean variablen
    boolean erlaubtZahlRange = true;
    boolean läuftProgrammWeiter = true;  //Boolean dafür, damit das Programm gegebenenfalls "aufhört", wenn vom Benutzer nicht eine gültige Zahl eingegeben wird.

    double berechungNachkommastelle =  punktzahl*10.0%10;  //Wandelt die erste Nachkommastelle in eine ganze Zahl um
    double berechungNachkommastelleZwei =  punktzahl*100.0%10;  //Wandelt die zweite nachkommastelle in eine ganze Zahl um -->Um zu überprüfen, ob man halt mehr Kommastellen bei der Zahl hat als erlaubt
    int umwanldungberechnungNachkommastelle = (int) berechungNachkommastelle;  //ich wandele den double in einen Integer um, weil ich damit leichter das Programm schreiben kann
    scanner.close();

    if (!(punktzahl>=0&&punktzahl<=90) ) erlaubtZahlRange =false;

    if ((!(umwanldungberechnungNachkommastelle==0 || umwanldungberechnungNachkommastelle==5))|| berechungNachkommastelleZwei>0) erlaubteNachkommastelle = false;
        // Übersetzung: Wenn die erste Nachkommastelle nicht 0 oder 5 ist        ODER die zweite Nachkommastelle größer als 0 ist, dann handelt es sich um keine erlaubteNachkommastelle  
    
    if (erlaubtZahlRange==false||erlaubteNachkommastelle==false) 
    // Übersetzung: Wenn entweder erlaubteZahlRang oder erlaubteNachkommastelle nicht erfüllt ist, dann gib an den Benutzter aus:
    {
        System.out.println("Sie dürfen nur ganze Zahlen oder Zahlen, die auf ,5 enden eingeben");
        läuftProgrammWeiter = false;
        

    }

    double oberesEnde = 85.5;
    double unteresEnde = 45;
    double abstand = 4.5;
    double note = 1.0;
    System.out.println("    Punkte \t Note");
    // Übersetzung: Wenn entweder erlaubteZahlRang oder erlaubteNachkommastelle nicht erfüllt ist, dann gib an den Benutzter aus: 


    for (; oberesEnde>=unteresEnde; oberesEnde= oberesEnde-abstand) {
        
        
        
    
        ;

        // note = Math.round(note*10);
        double zahl = note*10;
        zahl = zahl%10;
        // System.out.println(zahl);
        System.out.println("ab: " +oberesEnde  + "\t" + note );
        if (zahl==3.0) {
          note = note +0.4;
          note = note*10;    
          note = Math.round(note);
          note = note/10;
        //   note = Math.round(note*10)/10;  -->wieos geht das nicht anstatt die 3 zeile darüber -->Frage stellen Montag
        
        

        //  Wir runden (10*0.4 = 4 ) / 0.4


        }

        else 
        note = note +0.3;

    }

    //Ab hier beginnt die Ausrechnung bzw. Ausgabe der Note

    if (läuftProgrammWeiter==true) {
        System.out.print("Sie haben die Note: "); //print anstatt println
        if (punktzahl<45) System.out.print(5);
        else if(punktzahl>=45 && punktzahl<49.5) System.out.print(4);  //Einfach nur die Werte übernehmen
        else if(punktzahl>=49.5 && punktzahl<54) System.out.print(3.7); 
        else if(punktzahl>=54 && punktzahl<58.5) System.out.print(3.3);
        else if(punktzahl>=58.5 && punktzahl<63) System.out.print(3.0);
        else if(punktzahl>=63 && punktzahl<67.5) System.out.print(2.7); 
        else if(punktzahl>=67.5 && punktzahl<72) System.out.print(2.3);
        else if(punktzahl>=72 && punktzahl<76.5) System.out.print(2);
        else if(punktzahl>=76.5 && punktzahl<81) System.out.print(1.7);
        else if(punktzahl>=81 && punktzahl<85.5) System.out.print(1.3);
        else if(punktzahl>=85.5) System.out.print(1);

        System.out.print(" erreicht"); //print anstatt println
        
        }
        
    






    




    }
    
    
}
