package Sortiert.NeuesKlausurübungsaufgaben;

public class WandleUmInCents {

    public static void main(String[] args) {
    char [] test = WandleUmInCentss("00403,5");
    for (char c : test) {
        System.out.print(c);
    }
    }   

    public static char[] WandleUmInCentss(String betrag) {
        betrag = betrag.replace("," ,"");
        char[] ergebnis = betrag.toCharArray();
        boolean schalter = false;
        while (!schalter) {
            for (int i = 0 ; i< ergebnis.length; i++) {
                if (!schalter && ergebnis[i] =='0') {
                    ergebnis[i] = ' '; continue;
                }
                if (ergebnis[i]!='0') {
                    schalter = true;

                }
            }
        }
        return ergebnis;



    }
}
