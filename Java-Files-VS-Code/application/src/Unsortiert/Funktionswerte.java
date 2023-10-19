package Unsortiert;
public class Funktionswerte {
    public static void main (String[]args ) {
        
        int xEins = -5  ;
        int xZwei = 0;
        int xDrei = 5;
        
        double funktionEins= 0.5*xEins-3;
        double funktionZwei = (xEins+2) * (xEins+2);
        double funktionDrei = (xEins) * (xEins) * (xEins);
        System.out.println("");
        System.out.println("Ausgabe für x = " + xEins);
        System.out.println("");
        System.out.println("0.5 *" + xEins + " -3 = " + funktionEins);
        System.out.println("("+ xEins + "+2)^2= " + funktionZwei);
        System.out.println("(" + xEins + ")^3= " +funktionDrei);

        //Ab hier ist es eigentlich einfach nur kopierter Code mit halt xZwei anstatt xEins usw.
        double funktionEins1= 0.5*xZwei-3;
        double funktionZwei2 = (xZwei+2) * (xZwei+2);
        double funktionDrei3 = (xZwei) * (xZwei) * (xZwei);
        System.out.println("");
        System.out.println("Ausgabe für x = " + xZwei);
        System.out.println("");
        System.out.println("0.5 *" + xZwei + " -3 = " + funktionEins1);
        System.out.println("("+ xZwei + "+2)^2= " + funktionZwei2);
        System.out.println("(" + xZwei + ")^3= " +funktionDrei3);

        
        double funktionEins11= 0.5*xDrei-3;
        double funktionZwei22 = (xDrei+2) * (xDrei+2);
        double funktionDrei33 = (xDrei) * (xDrei) * (xDrei);
        System.out.println("");
        System.out.println("Ausgabe für x = " + xDrei);
        System.out.println("");
        System.out.println("0.5 *" + xDrei + " -3 = " + funktionEins11);
        System.out.println("("+ xDrei + "+2)^2= " + funktionZwei22);
        System.out.println("(" + xDrei + ")^3= " +funktionDrei33);



        
    }
}
