package Sortiert.ZweiteLektion ;

public class pqFormel {
    public static void main(String[] args)  {
        int p = 4; 
        int q = 3;
        double berechnungErsteNullstelle = (-p/2) + Math.sqrt(((p/2)*(p/2)) -q); //berechnet die erste nullstelle
        double berechnungZweiteNullstelle = (-p/2) - Math.sqrt(((p/2)*(p/2)) -q); //berechnet die erste nullstelle
        System.out.println("Die Nullstellen sind " + berechnungErsteNullstelle + " und " + berechnungZweiteNullstelle);  //Ich gebe das Ergbnis im Terminal aus. 
    }    
    
}
  

