package Sortiert.ZwölfteLektion.Listen;

public class DoppelverketteListe {

private class Personenknoten {

    int alter;
    String nachname;
    Personenknoten next;
    Personenknoten prev;

    public Personenknoten(int alter, String nachname) {
        this.alter = alter;
        this.nachname = nachname;
        next = null;
        prev = null;

    }



    //Für die Ausgabe des Personenknoten:
    
    public String toString() {
    return "Gefundender Knoten: " + "\nNachname=" + nachname + " \nAlter=" + alter;

}

}

Personenknoten head;


public void insert (String nachname, int alter) {
    Personenknoten newNode = new Personenknoten(alter, nachname);
    if (head == null) {
        head = newNode;
        return;  // Make sure to return after setting the head for the empty list
    }

    Personenknoten current = head;
    Personenknoten prev = null;

    while (current != null && current.nachname.compareTo(newNode.nachname) < 0) {
        prev = current;
        current = current.next;
    }

    // Update newNode's next and prev pointers
    newNode.next = current;
    newNode.prev = prev;

    // Update the next node's prev pointer if newNode is not the last node
    if (current != null) {
        current.prev = newNode;
    }

    // Update the previous node's next pointer if newNode is not the first node
    if (prev != null) {
        prev.next = newNode;
    } else {
        // If newNode is the first node, update the head
        head = newNode;
    }


}


public void showBackwards() {
    Personenknoten current = head;
    //Zum Ende der Liste gehen
    while (current.next!=null) {
        current = current.next;

    }
    //Jetzt sind wir beim letzten Node und gehen die Liste rückwärds und geben dabei die Werte (Nachname) aus

    while (current!=null) {
        System.out.print(current.nachname + "  ");
        current = current.prev;
    }




}

public Personenknoten searchForKnoten(String nachname) {
    Personenknoten current = head;
    int index = 0;
    while (current!=null && current.nachname!=nachname) {
        index++;
        current = current.next;


    }
    if (current==null) {
        System.out.println("Angegebener Nachname wurde nicht gefunden"); return null;
    }


    System.out.println("Gesuchter Knoten wurde bei index " + index + " gefunden");
    return current;


}


public void showFoward () {

        //Wir machen wieder einen Pointer
        Personenknoten current = head; //Und der Pointer fäng beim head natürlich an
        while (current!=null) {
            System.out.print(current.nachname +"  ");

            current = current.next; // Pointer wird sozusagen wieder um 1 erhöht


        }


    }







    public static void main(String[] args) {
        DoppelverketteListe liste = new DoppelverketteListe();
        
        liste.insert("Keno", 15);
        liste.insert("Rodrigo", 18);
        liste.insert("Ana", 16);
        liste.insert("Melina", 19);
        liste.insert("Zedric", 20);


        liste.showFoward();
        System.out.println("\n"); //Zur besseren Formatierung
        liste.showBackwards();
        System.out.println("\n"); //Zur besseren Formatierung
        System.out.println(liste.searchForKnoten("Melina"));
       

    }
    
}




