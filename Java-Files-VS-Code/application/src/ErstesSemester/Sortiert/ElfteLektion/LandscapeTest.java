package Sortiert.ElfteLektion;

public class LandscapeTest {
        public static void main(String[] args) {
            String[][] colorMatrix = {
                {"Blue", "Green", "Red"},
                {"Yellow", "IndianRed", "Purple"},
                {"Cyan", "Magenta", "Orange"}
            };

            Landscape FirstLandscape = new Landscape(colorMatrix);

                Point Ergebnis = FirstLandscape.findColor("IndianRed");

                //Ausgabe auf diese Weiße wegen Tell-Dont-Ask Prinzip
                if (Ergebnis.getX() == -1 && Ergebnis.getY() == -1) {
                    System.out.println("Farbe nicht gefunden.");
                } else {
                    System.out.println("Farbe gefunden an Position: (" + Ergebnis.getX() + ", " + Ergebnis.getY() + ")");
                }


        }
    
}
