import java.io.IOException;

public class Einzelzeichen {
    static boolean a = false;
    public static void main (String[]args) throws IOException{
        
        System.out.println("Geben sie ein Einzelzeichen ein");

        char einzelzeichen = (char) System.in.read(); //Fragt nach dem Einzelzeichen 

        if ((einzelzeichen>=65) && (einzelzeichen<=90)) {
            System.out.println("Großbuchstabe\n");
            a = true;
        } 
        if   ((einzelzeichen<58)||(einzelzeichen>=97&&einzelzeichen<=102)|| ((einzelzeichen>=65&&einzelzeichen<=70))){
            System.out.println("Hexadezimale Ziffer\n");
            a = true;

        }
        if ((einzelzeichen>=48) && (einzelzeichen<=55)) {
            System.out.println("oktale Ziffer\n");
            a = true;
            }

        if (einzelzeichen==48 || einzelzeichen ==49) {
            System.out.println("binäre Ziffer");
            a = true;
        }
        if (a ==false) {
            System.out.println("Unbekannt");
        }


    }





}


