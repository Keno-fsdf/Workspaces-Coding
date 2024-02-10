package Sortiert.Leetcode;

public class EachDigitOfaNumber {
    public static void main(String[] args) {
        
        int a = 365;
        
        String b = Integer.toString(a);
        int länge = b.length();
        int [] fertigeListe = new int[länge];
        // System.out.println(länge);
        //jetzt haben wir die länge
      
        // int a = 365;
        // System.out.println(rechnung);

        for (int i = länge; i>0; i--) {
            int rechnungE =  a%10;
            a = a/10;
            // System.out.println(rechnungE);
            fertigeListe[i-1] = rechnungE;

        }

        for (int elemente: fertigeListe) System.out.print( elemente + " ");

    } 
    
}
