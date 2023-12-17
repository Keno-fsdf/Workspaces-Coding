package Sortiert.KlausuraufgabenÜbung;

public class OnlineShop {

    public static void main(String[] args) {
        String preis = "0001,99";
        char[] a= wandleUmInCents(preis);
        for (char c : a) {
            System.out.print(c );
        }
        
    }
    public static char[] wandleUmInCents(String preis) {
        preis = preis.replace(",", ""); // Ersetze das Komma und aktualisiere die Variable
        char[] ergebnis = preis.toCharArray();
        
        for (int i = 0; i < ergebnis.length; i++) {
            if (ergebnis[i] == '0') {
                ergebnis[i] = '\0';
            }
        }
    
        return ergebnis;
    }
    


    
        
        
        
}
