package Sortiert.ElfteLektion;

public class Tickertest {

    public static void main(String[] args) {
        

        Ticker neuerTicker = new Ticker(45);
        // System.out.println(neuerTicker.getGroesse());
        String nachrichtenString = "Wettervorhersage: Schnee in Wuerzburg";
        char[] nachrichtenArrayString = nachrichtenString.toCharArray();
        neuerTicker.setNachricht(nachrichtenArrayString);
        neuerTicker.rotateNachricht(6);
        // neuerTicker.resetNachricht();
        char[] array = neuerTicker.getNachricht();
        for (char c : array) {
            System.out.print( c  );
        }

        

    }
    
}
