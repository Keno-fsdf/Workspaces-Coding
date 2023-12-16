package Sortiert.DreizehnteLektion;

public class Schachbrett {
    boolean[][] brett = new boolean[8][8];




    public void setzeTurm(int x, int y) {
        if (x>7||y>7 || x<0|| y<0) {
            System.out.println("Ungültige Eingabe"); return;
        }

        brett[x][y] = true;

        for (int i = 0; i<brett.length; i++) {
            for (int j = 0; j<brett[i].length;j++) {
                if (i==x || y==j) {
                    brett[i][j] = true;

                }


            }

        }

    }



    public String toString() {
        String ergebnis = "";
        for(boolean elemente[]: brett) {

            for (boolean innereElemente: elemente) {
                if (innereElemente==true) ergebnis+="X  ";
                else {
                    ergebnis+="0  ";
                }

            }
            ergebnis+="\n";


        }
        return ergebnis;
    
    }


    public static void main(String[] args) {
        Schachbrett brett = new Schachbrett();
        brett.setzeTurm(5, 5);
        System.out.println(brett);
    }


}


