package Sortiert.KlausurÜbungsaufgabenZwe;

public class SitplatzReservierung {
        


    public static void main(String[] args) {
        char[][] saal = erstelleSaal(5);

        fuelleSitze(saal);
        bucheSitze(saal, 3, 2);
        ausgabe(saal);
      

        
    }

    public static char[][] erstelleSaal(int anzahlReihen) {
        int breiteReihen = 3+ anzahlReihen;
        int extra = 3;
        char[][] saal = new char[anzahlReihen][breiteReihen];
        for (int i = 0; i<saal.length; i++) {

            for (int j = 0; j<saal[i].length; j++) {
                if (j<extra) {
                    saal[i][j] = '_';

                }


            }
            extra++;


        }
        return saal;



    }


    public static void fuelleSitze(char[][]saal) {

        for (int i = 0; i<saal.length; i++) {
            for (int j = 0; j<saal[i].length; j++) {
                

                if (saal[i][j]=='_') {
                    if (fifthyFifthy()) {
                        saal[i][j] ='x';
                    }
                    else { saal[i][j]= 'o'; }   


                }


            }


        }



    }


    public static boolean fifthyFifthy () {
        double zahl = Math.random();
        if (zahl<0.5) {
            return true;

        }
        return false;

    }

    public static void bucheSitze(char[][]saal, int reihe, int spalte ) {

        if (saal[reihe][spalte]!='x' && saal[reihe][spalte]!='\0') {
            saal[reihe][spalte] = 'x';


        }
        else {
            System.out.println("Platz nicht frei");
        }


    }

    public static void ausgabe(char[][]saal) {
        String ergebnis = "";

        for (int i = saal.length-1; i>=0; i--) {

            for (int j = saal[i].length-1; j>=0; j--) {
                ergebnis+=saal[i][j];



            }
            ergebnis+="\n";


        }
        System.out.println(ergebnis);


    }


}




