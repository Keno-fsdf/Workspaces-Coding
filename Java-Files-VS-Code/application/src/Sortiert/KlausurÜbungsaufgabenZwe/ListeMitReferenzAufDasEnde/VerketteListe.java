package Sortiert.KlausurÜbungsaufgabenZwe.ListeMitReferenzAufDasEnde;

public class VerketteListe {
        Knotenpunkt last;


        public void einfuege(Knotenpunkt knotenpunkt) {
            if (last==null) {

                last = knotenpunkt;
            }

            else {
                Knotenpunkt current = last;
                while (current.prev != null) {
                    current = current.prev;
                }
                current.prev = knotenpunkt;}


        }



        public String toString() {
            String ergebnis = "";
            Knotenpunkt current = last;

            while (current!=null) {
                ergebnis+= current.name;
                ergebnis+=" ";
                current = current.prev;

            }

            return ergebnis;





        }



        public static void main(String[] args) {
            VerketteListe liste = new VerketteListe();
    
            // Erstes Element hinzufügen
            Knotenpunkt knoten1 = new Knotenpunkt("Element 1");
            liste.einfuege(knoten1);
    
            // Zweites Element hinzufügen
            Knotenpunkt knoten2 = new Knotenpunkt("Element 2");
            liste.einfuege(knoten2);
    
            // Drittes Element hinzufügen
            Knotenpunkt knoten3 = new Knotenpunkt("Element 3");
            liste.einfuege(knoten3);
    
            // Ausgabe der Liste
            System.out.println("Verkettete Liste: " + liste.toString());
        }

}
