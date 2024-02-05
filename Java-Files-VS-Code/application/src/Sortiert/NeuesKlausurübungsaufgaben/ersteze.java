package Sortiert.NeuesKlausurübungsaufgaben;

public class ersteze {
    public static int ersetze (char [] array) {
        int leange = array.length-4;
        int zeahler = 0;
        for (int i = 0; i < leange; i++) {
        if (array[i] =='.') {
        array[i] ='_'; zeahler++;
    }
        
        }
        return zeahler;
        }
        
        public static void main (String[]args) {
        String eingabe = "Datei.nam..txt";
        char[] array = eingabe.toCharArray();
        ersetze(array);
        String ausgabe = "";
        for (char element: array) {
        ausgabe+=element;}
        System.out.println(ausgabe);
        }
        
        
        
        
        
        
        
        }

