package Sortiert.NeunteLektion;

public class Raum {
    
    private String kennung;
    private int anzahlSitzplätze;
    private boolean belegt;
    private String[] NamenListe;
    private int[] MatrikelnummerListe;
    public Raum (String kennung, int anzahlSitzplätze) {
        this.belegt = false; //Bei der Erstellung des Raums ist ja der Raum zu 100% nicht belegt
        this.kennung = kennung;
        this.anzahlSitzplätze = anzahlSitzplätze;
        this.NamenListe = new String[anzahlSitzplätze];
        this.MatrikelnummerListe = new int[anzahlSitzplätze];
    }


    public void belegungRaum() {
        this.belegt = true;
    }

    public boolean istBelegt() {
        return this.belegt;


    }

    public String[] getStringArray() {
        return this.NamenListe;

    }

    public int[] getIntArray() {
        return this.MatrikelnummerListe;

    }

    // public 
    public void betreteRaum(String name, int Matrikelnummer) {
        boolean istVollerRaum = true;
        for (int i = 0; i<NamenListe.length; i++) {
            if (NamenListe[i]==null) {
                NamenListe[i] = name;
                MatrikelnummerListe[i] = Matrikelnummer;
                 istVollerRaum = false;
                break;


            }

        }
         if (istVollerRaum == true) System.out.println("Der Raum ist voll, warte bis wieder Studenten den Raum verlassen haben");
    
    

 
    }

        public void verlasseRaum(String name) {
        
        for (int i = 0; i<NamenListe.length; i++) {
            if (NamenListe[i]==name) {
                NamenListe[i] = null;
                MatrikelnummerListe[i] = 0;
               
                break;

            }
            

        }
       

 
    }

    }






