package Sortiert.SiebteLektion;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("Übung Programmieren 1"));
        
    }

    public static String reverse(String text) {
        // char [] array = convertToArray(text);
        char [] array = text.toCharArray();
        // System.out.println("Array: " + java.util.Arrays.toString(array));
        int länge = array.length;

        char [] arrayNeu = new char[länge];

        // System.out.println(läng e);
        //Ab hier startet der eigentliche Umkehrungsprozess
        int b = 0;

     for (int i = länge-1; i>=0; i--) {
        arrayNeu[b] = array[i];
        b++;


     }
    //  System.out.println("Array: " + java.util.Arrays.toString(arrayNeu));

        return new String(arrayNeu);
    } 

    // public static char[] convertToArray (String text) {

    //     char[] array = text.toCharArray();

    //     return array;
        
    // }
    
}
