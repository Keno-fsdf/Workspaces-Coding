package Sortiert.SechsteLektion;

public class Dreieck {
    public static void main (String []args) {
        // System.out.println(dreieck(9));
       dreieck(21);

    }
    
    public static void dreieck (int zeilen) {  //davor war es String
        
        boolean abwechselnd = false;

        int sternchenSumme = 0; 
        int addierenSternchenproZeile = 0;

        int leerzeichen = zeilen; //abspeicherung in einer anderen variable 
        while (zeilen>0) {
        if (abwechselnd==false) { //  //printed die sachen innerhalb einer Zeile
            if (leerzeichen==zeilen) {
                System.out.print("");
                leerzeichen++;

            }

            while (leerzeichen>0) {  //gibt die Leerzeichen aus vor dem * -->Und jede Zeile gibt es ein Leerzeichen weniger aus
            System.out.print(" ");
            leerzeichen--;
            }
            leerzeichen = zeilen;


            System.out.print("*");   //Erste Stern der Zeile
            if (sternchenSumme ==0) sternchenSumme++;  //das brauch ich für die erste Zeile 

            while (sternchenSumme>0 && sternchenSumme<=addierenSternchenproZeile) //addiert pro Zeile ein * --> b ist die anzahl der extra sterne pro zeile
             {System.out.print(" *");  //Jeder weitere Stern jeder Zeile
             sternchenSumme++;  //ausgegebenen Sterne in der Zeile
        }
    
            abwechselnd =true;
        }
        sternchenSumme = 0; //resetet a für die neue zeile, damit erneut die anzahl der sterne ausgegeben/geprinted werden kann, sondern halt die summe der schon ausgegeben sterne in der neuen Zeile 0 ist
        addierenSternchenproZeile++;


        if (abwechselnd==true) { //Macht eine neue Zeile 
            System.out.println("");
            abwechselnd = false;

        }
        zeilen--;
        
    }



        
}}
