package Sortiert.NeuesKlausurübungsaufgaben.ListeWiederholungDrei;

public class LinkedList {
    Node head;
    
   


public boolean search(int alter) {

    if (head==null) return false; 

    Node current = head;
    while (current!=null) {
        if (current.alter==alter) {
            return true;
        }
        current = current.next;


    }
    return false;


}


public void display() {
    Node current = head;
    while (current!=null && current.next!=null) {
        // System.out.println(current.alter + " ");
        current = current.next;

    }
    while (current!=null) {
        System.out.println(current.alter + " ");
        current = current.prev;


    }




}



public void einfugen(String name, int alter) {
Node neueNode = new Node (name, alter);

if (head==null || alter< head.alter) {
neueNode.next = head;

if (head!=null) {
head.prev = neueNode; }
head = neueNode; 
}
else {
Node current = head;

while (current.next!=null && alter> current.alter) {
current = current.next; }




if (current.next!=null) {
current.next.prev = neueNode; }

neueNode.prev = current;
neueNode.next = current.next;
current.next = neueNode;
}





}





    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.einfugen("Alice", 25);
        linkedList.einfugen("fasku", 25);
        linkedList.einfugen("Bob", 30);
        linkedList.einfugen("Charlie", 20);
        linkedList.einfugen("David", 35);

        // displayLinkedList(linkedList);
        linkedList.display();
        System.out.println(linkedList.search(36));
    }

    private static void displayLinkedList(LinkedList list) {
        Node current = list.head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Alter: " + current.alter);
            current = current.next;
        }
    }


}
    
    
    
