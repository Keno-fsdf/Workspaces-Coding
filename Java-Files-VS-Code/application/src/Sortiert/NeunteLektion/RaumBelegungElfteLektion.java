package Sortiert.NeunteLektion;

public class RaumBelegungElfteLektion {
    private String kennung;
  
    private boolean belegt;
    private String[][] NamenListe;
    private int[][] MatrikelnummerListe;

    public RaumBelegungElfteLektion (String kennung, int leange, int breite) {
        this.belegt = false; //Bei der Erstellung des Raums ist ja der Raum zu 100% nicht belegt
        this.kennung = kennung;
        
        this.NamenListe = new String[leange][breite];
        this.MatrikelnummerListe = new int[leange][breite];
    }



    public String createCurrentRoomPlan(boolean showEmptyChair) {
        String ergebnis = "";
        for (int i = 0; i<NamenListe.length; i++) {
            for (int j = 0; j<NamenListe[i].length; j++) {
                if (NamenListe[i][j] != null) {
                    //Fügt die ersten beiden Buchstaben des Studentens zum String hinzu
                    ergebnis+= NamenListe[i][j].charAt(0);
                    ergebnis+= NamenListe[i][j].charAt(1);
                    ergebnis+= "  ";


                }
                if (showEmptyChair==true && NamenListe[i][j] == null) {
                    ergebnis+= "__  ";

                }

            }
            ergebnis+="\n";

        }
        

        return ergebnis;

    }

    public void belegungRaum() {
        this.belegt = true;
    }

    public boolean istBelegt() {
        return this.belegt;


    }

    public String[][] getStringArray() {
        return this.NamenListe;

    }

    public int[][] getIntArray() {
        return this.MatrikelnummerListe;

    }

    // public 
    public void betreteRaum(String name, int Matrikelnummer) {
        boolean istVollerRaum = true;
        for (int i = 0; i<NamenListe.length; i++) {
            for (int j = 0; j<NamenListe[i].length; j++) {
            if (NamenListe[i][j]==null) {
                NamenListe[i][j] = name;
                MatrikelnummerListe[i][j] = Matrikelnummer;
                 istVollerRaum = false;
                return;


            }
            
        }
        }
         if (istVollerRaum == true) System.out.println("Der Raum ist voll, warte bis wieder Studenten den Raum verlassen haben");
    
    

 
    }

        public void verlasseRaum(String name) {
        
        for (int i = 0; i<NamenListe.length; i++) {
            for (int j = 0; j<NamenListe[i].length; j++)
            if (NamenListe[i][j]==name) {
                NamenListe[i][j] = null;
                MatrikelnummerListe[i][j] = 0;
               
                break;

            }
            

        }
       

 
    }

    
}
