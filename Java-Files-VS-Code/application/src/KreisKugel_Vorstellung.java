public class KreisKugel_Vorstellung {
    public static void main (String[]args) {
        int r = 5;  //radius vom Kreis
        double kreisfläche = Math.PI*r*r; //r*r = r²
        // das  /n  dient der besseren Übersicht bzw. Formatierung

        System.out.println("Die Kreisfläche des Kreises mit dem Radius " + r + "cm beträgt: " + kreisfläche + "cm²" + "\n");  //Ich gebe das Ergbnis von der Kreisfläche im Terminal aus. 

        double kreisumfang = 2+Math.PI*r;

        System.out.println("Der Kreisumfläche des Kreises mit dem Radius " + r + "cm beträgt: " + kreisumfang + "cm²" + "\n "); // Ich gebe das Ergebnis vom Kreisumfang im Terminal aus

        double kugelvolumen = 4/3*Math.PI*r*r*r; // ich hab den datentyp double benutzt -->r*r*r = r³ r³

        System.out.println("Das Kugelvolumen mit dem Radius " + r + "cm beträgt: " + kugelvolumen +"cm³" );  //Ich gebe das Ergbnis von dem Kreisvolumen im Terminal aus. 
        

    } 
}
