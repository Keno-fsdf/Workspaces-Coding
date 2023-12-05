package Sortiert.ZwölfteLektion.Listen;

public class LottoListe {
    private Node head; // Zeiger auf den Anfang der Liste   //-->hat doch am Anfang den Wert "null??"

    // Innere Klasse bzw. Konsturktor für einen einzelnen Knoten
    private class Node {
        int data;
        Node next;

        public Node(int data) {  //Erstellung von einer Liste, aber bis jetzt sind die einzelnen Elemente der Liste noch nicht verbunden
            this.data = data;
            this.next = null;
        }
    }

    // Methode zum Hinzufügen eines neuen Knotenpunkts zur Liste

    public void addNode(int data) {
        Node newNode = new Node(data); //erstellung eines neuen Elements (Knotenpunkt)

        // Wenn die Liste leer ist oder der neue Wert kleiner als der erste Wert ist
        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
        } 
        
        
        else {
            Node current = head;

            // Suche die Stelle, an der der neue Wert eingefügt werden soll
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }

            // Füge den neuen Wert an der gefundenen Stelle ein
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void removeNode(int data) {
        // Wenn die Liste leer ist, gibt es nichts zu entfernen
        if (head == null) {
            return;
        }

        // Wenn der zu entfernende Knoten der Anfang der Liste ist
        if (head.data == data) {
            head = head.next;
            return;
        }

        // Suche nach dem zu entfernenden Knoten
        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        // Wenn der Knoten gefunden wurde, entferne ihn
        if (current != null) {
            previous.next = current.next;
        }
    }


    // Methode zum Anzeigen der gesamten Liste
    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public boolean searchNode(int target) {
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                return true; // Der Wert wurde gefunden
            }
            current = current.next; 
        }

        return false; // Der Wert wurde nicht gefunden
    }






    public static void main(String[] args) {
        // Erstellung einer Lottoliste
        LottoListe lottoListe = new LottoListe();
        LottoListe ziehungen = new LottoListe();

        for (int i = 1; i<50; i++) {
            lottoListe.addNode(i);

        }
        

        //Ziehung der Zahlen


        System.out.println("Die gezogenen Zahlen sind: ");
        for (int j = 0; j<6; j++) {      //j<6 weil 6 Lottoziehungen
            int k = 49;
            boolean zahlGefunden = false;
            int gezogenenZahl = -1;

            //Überprüft, ob die zahl noch in der Liste ist (zur vermeidung-doppelter Zahlen)
            while (zahlGefunden==false) {

            gezogenenZahl = (int) (Math.random()*k+1);
            if (lottoListe.searchNode(gezogenenZahl)==true) { zahlGefunden= true;}
            }

            //fügt die gezogene Zahlen zum Ergebnis (ziehung) hinzu
            
            ziehungen.addNode(gezogenenZahl); 
        
            
            //Entfernt die gezogenen Zahl vom Ergebnis

            lottoListe.removeNode(gezogenenZahl);
            k--;

        }
            ziehungen.displayList();
       //Liste nach Lottoziehung

        System.out.println("\nListe nach Lottoziehung:");
        // lottoListe.addNode(50);
        lottoListe.displayList();
    }
}

