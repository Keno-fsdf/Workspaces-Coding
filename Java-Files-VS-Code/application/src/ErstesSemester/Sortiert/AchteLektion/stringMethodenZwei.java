package Sortiert.AchteLektion;

public class stringMethodenZwei {

    public static void main(String[] args) {
    String test = "  Ich gehe  morgen mit meinen     11 Freund*innen zum        Essen!  ";
    System.out.println(deleteStartingSpace(test)+ "B");
    System.out.println(deletingEndingSpaces(test)+"B");   //Das "B" soll nur Testen, ob wirklich keine white-spaces mehr da sind
    System.out.println( deleteMultipleSpace(test)+"B");
    String input = "Ich gehe morgen mit meinen 11 Freund*innen zum Essen!";
    String[] result = splitAtSpace(input);

    // Ausgabe des Ergebnisses
    System.out.println("Index:" + "\tInhalt");
    for (int i = 0; i < result.length; i++) {
        System.out.println(i + ": \t" + result[i]);
    }
    }

    // System.out.println(spiltAtSpace(test)); 
    

    public static String deleteStartingSpace(String sentence)  {
    boolean whiteSpaces = true;
    int i = 0;
    for (; whiteSpaces==true && i<sentence.length(); i++ ) {
        if (sentence.charAt(i)!=32) whiteSpaces=false;

    }
    String ergebnis = sentence.substring(i-1, sentence.length()-1);
    return ergebnis;

    }


    public static String deletingEndingSpaces(String sentence)  {
    boolean whiteSpaces = true;
    int i = sentence.length()-1;
    for (; whiteSpaces==true && i>=0; i-- ) {
        if (sentence.charAt(i)!=32) whiteSpaces=false;

    }
    String ergebnis = sentence.substring(0, i+2);  //i+1 , weil man ja bei for schleife trotzdem für die den durchlauf i-- macht
    // und nochmal i+1, weil der erste Argument Inklusiv ist und das zweite exklusiv, also in Mathe so formuliert [beginIndex, endingIndex[
    return ergebnis;

    }
    public static String  deleteMultipleSpace(String sentence)  {
   
    sentence = sentence.replaceAll("\\s+", " ");
    return sentence;

    }



    public static String[] splitAtSpace(String input) {
        // Zähle die Anzahl der Leerzeichen im String
        int spaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Initialisiere das String-Array basierend auf der Anzahl der Leerzeichen
        String[] result = new String[spaceCount + 1]; //+1, weil ein Wort 0 White-Space hat, aber trotzdem 1 wort ist

        int startIndex = 0;
        int arrayIndex = 0;

        // Iteriere durch den Eingabestring
        for (int i = 0; i < input.length(); i++) {
            // Wenn ein Leerzeichen gefunden wird, extrahiere das aktuelle Wort
            if (input.charAt(i) == ' ') {
                result[arrayIndex] = input.substring(startIndex, i);
                startIndex = i + 1; // Setze den Startindex für das nächste Wort
                arrayIndex++;
            }
        }

        // Extrahiere das letzte Wort nach dem letzten Leerzeichen
        result[arrayIndex] = input.substring(startIndex);

        return result;
    }


 //ascii code, lerrzeichen überprüüfen / string array
 //32


}
