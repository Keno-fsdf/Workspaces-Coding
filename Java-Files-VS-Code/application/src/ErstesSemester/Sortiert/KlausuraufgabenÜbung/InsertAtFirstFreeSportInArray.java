package Sortiert.KlausuraufgabenÜbung;

public class InsertAtFirstFreeSportInArray {
    
    public static void main(String[] args) {
        String []array = new String[5];
        array[0 ] = "kaka"; 
        String neuesWort = "Hallo";
        //Wie macht man es bei einer int[]
        for (int i = 0; i<array.length; i++) {
            if (array[i]==null) {
                array[i] = neuesWort;
                break;


            }

        }

        for (String elemente: array) {
            System.out.println(elemente);

        }


       
          
                int[] a = new int[20];
                a[0] = 42; // Beispielwert
        
                int neueZahl = 123; // Neuer Wert
        
                // Ähnlich wie bei der String-Version
                for (int i = 0; i < array.length; i++) {
                    if (a[i] == 0) { // Hier verwenden wir 0 als Platzhalter für "null" bei int[]
                        a[i] = neueZahl;
                        break;
                    }
                }
        
                // Ausgabe der Werte im Array
                for (int element : a) {
                    System.out.println(element);
                }
            
        
        

        








    }

}
