package Sortiert.KlausuraufgabenÜbung;

public class AlkoholBerechnung {
    public static void main(String[] args) {
        double bierMasse = berechneMasse(1000, 0.05);
        System.out.println("Die Akloholmasse von einem Bier mit 1L mit 0.05 prozent alkohol beträgt " + bierMasse);
        double personAlkKonzentration = berechneAlkKonzentration(bierMasse, 70, 'm');
        System.out.println(personAlkKonzentration);
        if (personAlkKonzentration>=0.5) System.out.println("Sie dürfen kein Auto mehr fahren");
        else System.out.println("Sie sollten kein Auto mehr fahren");
        
        //passt das wenn man bei soeiner Aufgabe double werte direkt so vergelicht und so mit ihnen rechnet??
        String a = ",";
        a.replace(',',' ');
        System.out.println();






    }
    public static double berechneMasse(double volumen, double alkohohlvolumenanteil) {
 
        final double ALKOHOL_DICHTE = 0.8;
        double masseGetränk = ALKOHOL_DICHTE*volumen*alkohohlvolumenanteil;
        return masseGetränk;
     }	
        
        
        public static double berechneAlkKonzentration (double alkoholmasse, double gewicht, char geschlecht) {
        double reduktionsfaktor = 0;
        if (geschlecht!= 'm' && geschlecht!='w' && geschlecht!='j') { System.out.println( "Ungültige Angabe des Geschlechts. Sie können nur 'm', 'w' und 'j' angeben");
        return -1.0;
        }
        
        else if (geschlecht =='m') reduktionsfaktor = 0.7;
        else if (geschlecht =='w') reduktionsfaktor = 0.6;
        else reduktionsfaktor = 0.5;
        
            
        
        double alkKonzentration = (alkoholmasse) / (gewicht* reduktionsfaktor);
        return alkKonzentration;
        
    }}
