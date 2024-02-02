package Sortiert.ZwölfteLektion.ÜbungZwei.ÜbungListen;

public class Liste {
    Node head;
    
    public Liste() {
    this.head = null;
    }
    
    //einfügen am ende der Liste
    public void addNode (int val) { 
    Node neuNode = new Node (val) ;
    
    if (head==null) {
    head = neuNode;
    return;
    }
    Node current = head; 
    while (current.next!=null) {
    current = current.next; 
    }
    current.next = neuNode;
    
}




public void insertAtTheBeginning (int val) {

    Node neueNode = new Node (val) ;
    if (head==null) {
    head = neueNode;
    return;
    }
    neueNode.next = head;
    head = neueNode;
    }
    
  



        public void deleteNode(int val) {
        if (head == null) return;
        if (head.val==val) {
        head = head.next; }
        else {
        
        Node current = head;
        while (current.next!=null) {
        
        if (current.next.val == val) {
        current.next = current.next.next;break;} 
        current = current.next;
        
        
        
        
        }
    
    }
        }


        public void deleteIndex (int index) {
            if (head==null) return;
            if (index == 0) {  head = head.next;}
            else {
            Node current = head;
            int i = 0; 
            while (current.next != null) {
            
            if ( i+1 == index) {
            current.next = current.next.next; return; }
            
            else {
            current = current.next; }
                i++;
        
        }}}


             
            
            
            
            
            
        
        





public void insertSorted(int val) {
    Node neuNode = new Node(val);

    if (head ==null || val<head.val) {
        neuNode.next = head;
        head = neuNode;

    }
    else {
        Node current = head;
        while (current.next!=null && current.next.val<neuNode.val) {
            current = current.next;

        }
        neuNode.next = current.next;
        current.next = neuNode;

        




    }

}



































    public void display() {
        Node current = head;

        while (current!=null) {
            System.out.print(current.val + " ");


            current = current.next;



        }




        
    }




    public static void main (String[]args) {
        Liste neueListe = new Liste();
        neueListe.addNode(5);
        neueListe.addNode(13);
        neueListe.insertSorted(15);
        // neueListe.insertAtTheBeginning(;
        // neueListe.deleteNode(15);
        neueListe.deleteIndex(0);
        neueListe.display();

    }





}