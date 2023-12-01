package Sortiert.ElfteLektion;


public class TicTacToe {
    public static void main(String[] args) {
        boolean[][][] ticTacToeArray3d = new boolean[3][3][3];
        fülltArrayMitBooleanWertenAus(ticTacToeArray3d);  

        char[][][]  ticTacToeArrayFertig = booleanArrayToCharArray(ticTacToeArray3d);

        int zähler = 1;




        for (char[][] dimensionen : ticTacToeArrayFertig) {
            System.out.println(zähler+" Dimension\n");
            zähler++;
            for (char[] zeilen : dimensionen) {

                for (char spalten : zeilen) {
                    System.out.print(spalten + " ");

                }
                System.out.println();

            }
            System.out.println();
            
        }


    }




        private static char[][][] booleanArrayToCharArray(boolean[][][] DreiDArray) {  //war kinda unnötig, siehe anders dokument "ThreeDTicTacToe" --> // Ausgabe von 'x' für true und 'o' für false
         // System.out.print(field[i][j][k] ? "x " : "o ");
        
        char [][][] ticTacToeArray = new char[3][3][3];


        for (int k = 0; k<DreiDArray.length; k++) {
            
            for (int i =0; i<DreiDArray[k].length;i++) {

                for (int j = 0; j<DreiDArray[k][i].length; j++) {
                    if (DreiDArray[k][i][j] == true) {
                        ticTacToeArray[k][i][j] = 'x';

                    }
                    else ticTacToeArray[k][i][j] = 'o';

                }

            }
        }

        return ticTacToeArray;


    }





    private static void fülltArrayMitBooleanWertenAus(boolean[][][] DreiDArray) {
        for (int k = 0; k<DreiDArray.length; k++) {
            
            for (int i =0; i<DreiDArray[k].length;i++) {

                for (int j = 0; j<DreiDArray[k][i].length; j++) {
                    DreiDArray[k][i][j] = fiftyFifty();

                }

            }
        }

    }

    private static boolean fiftyFifty () {

        double zahl = Math.random();
        if (zahl<0.5) {
            return true;
        }
        else return false;

    }





    
}
