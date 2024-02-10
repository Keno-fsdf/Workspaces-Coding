package Sortiert.ElfteLektion;

public class Zeilenmaxima {
    public static void main(String[] args) {
        double[][] test = {{322.5,5,8}, {8,9,22}, {3,555,1,888}, {3}};
        double[] ergebnis = zeilenmaxima(test);
        for (double elemente: ergebnis) System.out.println(elemente + " ");


        
    }

    public static double[] zeilenmaxima(double[][] zweidimensionaleArray) {

        double[] maximumWerte = new double[zweidimensionaleArray.length];

        for (int i = 0; i<zweidimensionaleArray.length; i++) {
            double maximum = zweidimensionaleArray[i][0];

            for (int j = 0; j<zweidimensionaleArray[i].length;j++) {
    

                // maximum = zweidimensionaleArray[i][0];
                for (int k = 1+j; k<zweidimensionaleArray[i].length;k++) {
                    if (zweidimensionaleArray[i][k]>maximum) { maximum= zweidimensionaleArray[i][k]; }



                }

            }


            maximumWerte[i] = maximum;


        }   

        return maximumWerte;











    }

    
}
