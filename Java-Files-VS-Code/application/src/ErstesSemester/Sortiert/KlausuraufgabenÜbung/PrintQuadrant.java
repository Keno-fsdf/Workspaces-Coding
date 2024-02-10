package Sortiert.KlausuraufgabenÜbung;

public class PrintQuadrant {
public static void main(String[] args) {
    printQuadrant(4);
}   
    

public static void printQuadrant(int zeilen) {
char[][] quadrant = new char[zeilen][4];

for (int i = 0; i<quadrant.length; i++) {

    for (int j = 0; j<quadrant[i].length; j++) {
        if (i==0 || i==quadrant.length-1) {
            quadrant[i][j] = '*';

        } 
        else {
            if (j==0 || j == quadrant[i].length-1) {
                quadrant[i][j] = '*';

            }
            else {
                quadrant[i][j] = ' ';

            }

        }

        


    }  


}

for (char[] cs : quadrant) {
    for (char cs2 : cs) {
        System.out.print(cs2);
    }
    System.out.println();
}




}

}


