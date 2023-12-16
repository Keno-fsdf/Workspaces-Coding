package Sortiert.KlausuraufgabenÜbung;

public class Aufgabe1a {
    
    public static void main(String[] args) {
        String a = "Graphik.Init.Datei.ini";
        char[] array = a.toCharArray();
        System.out.println(ersetze(array));
        for (char c : array) {
            System.out.print(c );
        }
    }

    public static int ersetze ( char[]array) {
        int z = 0;
        for (int i = 0; i+4<array.length; i++) {
            if (array[i]=='.') {

                array[i] = '_';
                z++;
            }

        } 
        return z;
    }


}
