package Sortiert.FünfteLektion;

public class PrimzahlRefactoring {
    public static void main (String []args) {
        System.out.println(primzahl(7));

    }

    public static boolean primzahl (int zahl) {
        boolean primzahl = true; 

        //Überprüfung ob es sich um eine Primzahl handelt innerhalb der if Schleife

        for (int zahlenUnterZahlZuÜberprüfen = zahl-1; zahlenUnterZahlZuÜberprüfen>1;zahlenUnterZahlZuÜberprüfen--){  //-->Wir müssen vor 1 aufhören 6%1 = 0 

        int überprüfungGanzzahigNurDurchSichSelbst = zahl%zahlenUnterZahlZuÜberprüfen;  //Berechnung mit dem Modulo Operator. -->Erklärung siehe direkt darunter
        if (überprüfungGanzzahigNurDurchSichSelbst==0) primzahl=false;
             
        }
        

        
        if (primzahl==false) return false;
        else return true;

        
        


        

    }   
    
}
