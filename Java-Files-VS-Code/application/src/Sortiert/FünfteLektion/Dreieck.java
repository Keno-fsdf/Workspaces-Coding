package Sortiert.FünfteLektion;

public class Dreieck {
    public static void main (String []args) {
        // System.out.println(dreieck(9));
       dreieck(9);

    }
    
    public static void dreieck (int zeilen) {  //davor war es String
        
        boolean abwechselnd = false;
        int a = 0;
        int b = 0;
        int leerzeichen = zeilen; //abspeicherung in einer anderen variable 
        while (zeilen>0) {
        if (abwechselnd==false) {
            if (leerzeichen==zeilen) {
                System.out.print("");
                leerzeichen++;

            }

            while (leerzeichen>0) {
            System.out.print(" ");
            leerzeichen--;
            }
            leerzeichen = zeilen;


            System.out.print("*");
            if (a ==0) a++;  //das brauch ich für die erste Zeile 

            while (a>0 && a<=b) //addiert pro Zeile ein *
             {System.out.print(" *");
             a++;
        }
    
            abwechselnd =true;
        }
        a = 0;
        b++;





        if (abwechselnd==true) { //Macht eine neue Zeile 
            System.out.println("");
            abwechselnd = false;

        }
        zeilen--;
        
    }
    // String c = "Programm fertig";
    // return c;

        // for (int zealer = 1; zeilen>=zealer; zealer++) {
        //     System.out.println("* ");
              
        // }
        // for (int zealer = 1; zeilen>=zealer; zealer++) {
        //  System.out.print(" *");}



        
}}
