package Sortiert.NeuesKlausurübungsaufgaben;

public class AufgabeDrei {
    public class Node {
        String name;
        Node prev;
        public Node (String name) {
        this.name = name;
        this.prev = null;
        }
        
        }
        
        public class Liste {
        Node end;
        public Liste () {
        this.end = null;}
        
        
        
        
        
        
        
        
        
        
        public void einfuegen(String name) {
            Node neueNode = new Node(name);
            if (end == null) {
                end = neueNode;
            } else {
                Node current = end;
                while (current.prev != null) {
                    current = current.prev;
                }
                current.prev = neueNode;
            }
        }
        



        @Override
        public String toString() {
        String ergebnis = " ";
        Node current = end;
        while (current!=null) {
        ergebnis += current.name; ergebnis+= " ";
        current = current.prev;}
        return ergebnis;}
}

    //testcode:
   
        public static void main(String[] args) {
            AufgabeDrei.Liste meineListe = new AufgabeDrei().new Liste();
    
            // Füge einige Elemente ein
            meineListe.einfuegen("Element1");
            meineListe.einfuegen("Element2");
            meineListe.einfuegen("Element3");
    
            // Gib die Liste aus
            System.out.println("Aktuelle Liste: " + meineListe);
    
            // Füge ein weiteres Element ein
            meineListe.einfuegen("Element4");
    
            // Gib die aktualisierte Liste aus
            System.out.println("Aktualisierte Liste: " + meineListe);
        }
    
    



}
