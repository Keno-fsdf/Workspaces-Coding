package Sortiert.AchteLektion;

import java.util.Scanner;

import javax.sound.midi.Track;

public class Galgenmännchen {
    public static void main(String[] args) {

        hauptprogramm();
        
    }

    public static String convertToStriche (String wort) {
        char [] liste = wort.toCharArray();
        int anzahlDerStriche = liste.length;
        

        char [] unterstriche = new char[anzahlDerStriche];
        for (int i = 0; i < anzahlDerStriche; i++) {
            unterstriche[i] = '_';
        }
        // String neuerString = anzahlDerStriche* "_";
        return new String(unterstriche);     



    }

    public static String convertToGroßbuchstaben(String wort) {
        char wortInEinzelbuchstaben[] = wort.toCharArray();

        for (int i = 0; i<wortInEinzelbuchstaben.length; i++) {
            if (wortInEinzelbuchstaben[i]>=97 && wortInEinzelbuchstaben[i]<=122) {
                int integerwert = wortInEinzelbuchstaben[i]-32;
                wortInEinzelbuchstaben[i] = (char)integerwert;
                

            }
        }

        String neuerString = new String (wortInEinzelbuchstaben);
        return neuerString;


    }

    public static char convertEinzelbuchstabenZuGroßbuchstaben (char buchstabe) {
        if (buchstabe>=97 && buchstabe<=122) {
                int integerwert = buchstabe-32;
                buchstabe = (char)integerwert;
                

            }

        return buchstabe;


    }

    public static char buchstabeVomUser () {
        Scanner scanner = new Scanner(System.in);
        String zurÜberprüfungDerLänge;
        boolean einZeichen;
        do {
        zurÜberprüfungDerLänge = scanner.nextLine();
        einZeichen = true;


        if (zurÜberprüfungDerLänge.length()>1) {
            System.out.println("Bitte geb nur ein Buchstaben ein");
            einZeichen = false;

        }
    } while (einZeichen==false);

    char Benutzereingabe = zurÜberprüfungDerLänge.charAt(0);



    return Benutzereingabe;


    }


    public static String auswahlWort (String[] listeStrings, int werte) {
        int wortIndex = (int) (Math.random()*werte); //Das wieder auf 20umändern anstatt die 3
        String wort = listeStrings[wortIndex];
        return wort;




    }

    public static void hauptprogramm () {
        // System.out.println(convertEinzelbuchstabenZuGroßbuchstaben(3));
        
        // char buchstabeVomUsers = buchstabeVomUser();   //Buchstabe
        String[] wortliste = {"Programmiersprache", "Integer", "Vim", "Adblocker"};
        String wort = convertToGroßbuchstaben(auswahlWort(wortliste,4));              
        System.out.println(wort);
        char [] arrayWort = wort.toCharArray();

        String strichWort = convertToStriche(wort);
        char [] strichWortArray = strichWort.toCharArray();

        // System.out.println(strichWort);

        int [] orteDieErsetztWerdenMüssen = new int[wort.length()]; 
        //schauen ob Buchstabe im Wort
        


        int versuche = 15;

        boolean nochNichtErraten = true;
        int counter = 0;
        while (counter<versuche && nochNichtErraten==true) {
            char buchstabeVomUsers = convertEinzelbuchstabenZuGroßbuchstaben(buchstabeVomUser());  //hier auch noch großbuchstabe
        int a = 0;
        for (int i = 0; i<wort.length();i++) {
            if (arrayWort[i]==buchstabeVomUsers) {
                
                //zwischenspeichern von dem ort wo in dem wort (list), der buchstabe liegt
                orteDieErsetztWerdenMüssen[a] = i; //In der liste wir der ort gespeichert wo der buchstabe gleich war
                a++;



            }



        }

        for (int c = 0; c<a; c++) {
            strichWortArray[orteDieErsetztWerdenMüssen[c]] = buchstabeVomUsers;      

        }
        String d = new String(strichWortArray);

        System.out.println("Versuch " + (counter +1) + " : " + d);
        counter++;
        String überprüfung = new String(strichWortArray);
        if (überprüfung.equals(wort)) {nochNichtErraten = false; System.out.println("Sie haben das wort erraten"); }
        if (counter==versuche) System.out.println("Sie haben das Wort NICHT erraten");



    }
}


}
