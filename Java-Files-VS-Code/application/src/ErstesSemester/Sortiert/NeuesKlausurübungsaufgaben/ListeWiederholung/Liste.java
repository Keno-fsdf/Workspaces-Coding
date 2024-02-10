package Sortiert.NeuesKlausurübungsaufgaben.ListeWiederholung;

import Sortiert.NeuesKlausurübungsaufgaben.reihen;

public class Liste {

    Node head;
    
    public void einfugen (String text) {
    Node newNode = new Node (text); 
    if (head==null || text.compareTo(head.text)<0) {
    newNode.next = head;
    head = newNode; }
    
    else {
    Node current = head; 
    
    while (current.next!=null && text.compareTo(current.next.text)> 0   ) {
    
    current = current.next; }
    newNode.next = current.next;
    current.next = newNode;
    }
}


public void einfugenStart(String text) {
    Node newNode = new Node(text);
    newNode.next = head;
    head = newNode; 
}

public void einfugenEnd (String text) {
    Node newNode = new Node(text);
    if (head==null)  { head = newNode; return; }
    Node current = head;
    while (current.next!=null) {
       current = current.next; 

    }
    current.next = newNode;


}
    

public void display () {
    Node current = head;
    while (current!=null) {
        System.out.print(current.text + " ");
        current = current.next;

    }

}

public void displayReversed() {
    displayReversedHelper(head);
}

private void displayReversedHelper(Node current) {
    if (current == null) {
        return;
    }

    displayReversedHelper(current.next);
    System.out.print(current.text + " ");
}


public static void main(String[] args) {
    // Erstellen einer Instanz der Liste
    Liste liste = new Liste();
    
    // Einfügen von Elementen in die Liste
    liste.einfugen("Banana");
    liste.einfugen("Apple");
    liste.einfugen("Orange");
    liste.einfugen("Grapes");
    liste.einfugen("Cherry");
    // liste.einfugenStart("Z");
    liste.einfugen("Z");
    // liste.einfugenEnd("A");

    // Anzeigen der sortierten Liste
    System.out.println("Sorted List:");
    // liste.display();
    liste.displayReversed();
}



}
    
