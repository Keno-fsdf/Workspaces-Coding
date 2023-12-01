package Sortiert.ElfteLektion;

public class Landscape 
{
    private String[][] colorMatrix;

    public Landscape(String[][] colorMatrix){
        this.colorMatrix = colorMatrix;

    }

    public Point findColor(String farbe) {
        for (int i = 0; i<colorMatrix.length; i++) {
            for (int j = 0; j<colorMatrix[i].length; j++) {
                if (colorMatrix[i][j]==farbe) {
                    Point gefundenFarbePunkt = new Point(i, j);
                    return gefundenFarbePunkt;

                }


            }
           

        }
        Point nichtsGefundenPunkt = new Point(-1, -1);
        return nichtsGefundenPunkt; //punkt mit 00 zurückgeben
    }

    
}
