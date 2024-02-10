package Sortiert.ZwölfteLektion.Listen;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private ListNode head;

    public CircularLinkedList() {
        this.head = null;
    }

    // Füge ein Element am Ende der Liste ein
    public void insert(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            // Wenn die Liste leer ist, setze das neue Element als Kopf
            head = newNode;
            newNode.next = head;
        } else {
            // Andernfalls füge das neue Element am Ende der Liste hinzu
            ListNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Gib die ringverkettete Liste aus
    public void display() {
        if (head == null) {
            System.out.println("Die Liste ist leer.");
            return;
        }

        ListNode current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}





