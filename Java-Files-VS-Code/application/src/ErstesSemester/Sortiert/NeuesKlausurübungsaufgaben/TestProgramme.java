package Sortiert.NeuesKlausurübungsaufgaben;

public class TestProgramme {

    public static void main(String[] args) {
        // Teste bubblesss-Methode
        int[] array = {4, 2, 7, 1, 5, 3, 8, 6};
        System.out.println("Vor der Sortierung:");
        printArray(array);
        bubblesss(array);
        System.out.println("Nach der Sortierung:");
        printArray(array);

        // Teste randomAcht-Methode
        System.out.println("Zufallszahl zwischen 1 und 8: " + randomAcht());

        // Teste pow-Methode
        System.out.println("Ergebnis von 2^3: " + pow(2, 3));

        // Teste fifthy-Methode
        System.out.println("Zufallszahl kleiner als 0.5: " + fifthy());
    } 
        
        public static void bubblesss(int [] array) {
        for (int i = 0; i<array.length; i++) {
        for (int j = 1+i; j<array.length; j++){
        if (array[i]>array[j]) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp; }
        }}}
        
        // eine zahl zwischen 1 und 8
        
        public static int randomAcht () {
        int zahl = (int) (Math.random()*8 +1);
        return zahl; }
        
        public static double pow (double basis, int potenz) {
        double ergebnis = 1;
        
        while (potenz>0) {
        ergebnis*=basis;
        potenz--; }
        return ergebnis;
        }
    
        public static boolean fifthy() {
            return Math.random()<0.5; }
            
            public static void printArray(int[] array) {
                for (int num : array) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
    }
        
        
        
    

