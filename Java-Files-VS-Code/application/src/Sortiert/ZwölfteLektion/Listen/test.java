package Sortiert.ZwölfteLektion.Listen;

public class test {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();

        circularList.insert(1);
        circularList.insert(2);
        circularList.insert(3);
        circularList.insert(4);

        System.out.println("Ringverkettete Liste:");
        circularList.display();
    }

}
