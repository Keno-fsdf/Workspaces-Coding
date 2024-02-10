package Sortiert.NeuesKlausurübungsaufgaben.ListeWiederholungDrei;

public class Programmeesss {



    public static boolean fifthy () {

        return Math.random()<0.5; 
    }


    public static double pow (double basis, int potenz) {
        double ergebnis = 1;
        while (potenz>0) {
            ergebnis*=basis;
            potenz--;
        }
        
        return ergebnis;

    }


    public static void sort(int[] array) {
        for (int i = 0; i<array.length; i++) {

            for (int j = 0; j<array.length; j++) {

                if (array[i]>array[j]) {
                    int temp = array[i] ;
                    array[i] = array[j];
                    array[j] = temp; }



                }

            }


        }



        //random zahl zwischen 6 und 10 inklusive 
        public static int random() {
        return (int) (6+ Math.random() *5);


        }

    }


    

