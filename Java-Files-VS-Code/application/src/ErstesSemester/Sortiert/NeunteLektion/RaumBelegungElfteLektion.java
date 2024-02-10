package Sortiert.NeunteLektion;

public class RaumBelegungElfteLektion {
    private String kennung;
  
    private boolean belegt;
    private String[][] NamenListe;
    private int[][] MatrikelnummerListe;
    private int erweiterung;


    public RaumBelegungElfteLektion (String kennung, int leange, int breite) {
        this.belegt = false; //Bei der Erstellung des Raums ist ja der Raum zu 100% nicht belegt
        this.kennung = kennung;
        
        this.NamenListe = new String[leange][breite];


        this.MatrikelnummerListe = new int[leange][breite];
    }


    public RaumBelegungElfteLektion(String kennung, int leange, int breite, int erweiterung) {
        this.belegt = false;
        this.kennung = kennung;
        this.erweiterung = erweiterung;
    
        this.NamenListe = new String[leange][breite+erweiterung];
        this.MatrikelnummerListe = new int[leange][breite+erweiterung];
        int zähler = 0;
        //wenn die erweiterung kleiner als die länge der Namenlist ist, dann
        for (int i = erweiterung; i<this.NamenListe.length; i++) {
            zähler++;
 }

        }





    public String createCurrentRoomPlan(boolean showEmptyChair) {
        String ergebnis = "";
        for (int i = 0; i<NamenListe.length; i++) {


            // for (int k = 0; k<NamenListe.length-erweiterung; k++) {
            //     ergebnis+="    "; //Es muss um 4 zeichen pro erweiterungszeile erweitert wrden
            // }
            
                    if(i>erweiterung) {
                    ergebnis+="__  ";
                }
                    else { 
                        int a = NamenListe.length-erweiterung;
                        ergebnis+="    ";
                
                }

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

                    if(i>erweiterung) {
                    ergebnis+="__ ";
                }
                    else ergebnis+="    ";

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
