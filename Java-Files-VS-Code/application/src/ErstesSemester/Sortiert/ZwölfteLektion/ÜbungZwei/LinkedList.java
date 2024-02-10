package Sortiert.ZwölfteLektion.ÜbungZwei;

public class LinkedList {

    Node head;

    //Hier kommen jetzt die ganzen methoden rein, wie hinzufügen und entfernen
    




    public void insertAtTheBeginning(int val) {
        Node neueListNode = new Node(val);
        if (head==null) {
            head = neueListNode;

        }
       
        else {
         Node temp = head;
         head = neueListNode;
         head.next = temp;     

        }

    }


    public void insertAtTheEnd (int val) {
        Node neueNode = new Node(val);
        if (head==null) {
            head = neueNode;
        }
        else {
            Node current = head;
            Node prev = null;
            while (current!=null) {
                prev = current;
                current = current.next;
            }
            prev.next = neueNode;





        }


    }


    public void insertSorted(int val) {
        Node newNode = new Node(val);

        if (head==null || val<head.val) {
            
            newNode.next = head;
            head = newNode;



        }

        else {
            Node current = head;
            while (current.next!=null && current.next.val<val) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;


            

        }




    }



    public void deleteNode (int val) {
        Node current = head;
        //base case for delketing at the beginnign of a list
        if (current.val==val) {
            head = current.next;
            return;

        }


        while (current!= null && current.next!=null) {
            if (current.next.val==val) {
                current.next = current.next.next;


                //kann man hinzfügen wenn man nur einmal einen wert entfernen will, wenn es duplikate gibt
                current = current.next;
                return;
            }
            else {

                current = current.next;
            }


            

        }


    }

    //fragt auch, ob es die richtige anzahl der nodes gibt
    public boolean doesNodeExist(int val, int amount) {
        Node current = head;
        int zeahler = 0;
        while (current!=null) {

            if (current.val==val) zeahler++;

            current=current.next;

        }
        if (zeahler==amount) return true;
        return false;


    }




    public int searchNodeIndex (int val) {
        Node current = head;
        int index = 0;
        while (current!=null) {
            
            if (current.val==val) {
                return index;

            }
            index++;
            current = current.next;
            
        }
        return -1;

    }

    public void deleteAtGivenIndex (int index) {

        if (index==0) {
            head = head.next; 

        }


        else {
            Node current = head;
            
            while (current!=null && index-1>0 ) {

                current = current.next;

                index--;
            }
            if (current.next!=null) current.next = current.next.next;





        } }


    public void insertAtGivenIndex (int val, int index) {
        Node newNode = new Node(val);

        if (index==0) {
            newNode.next = head;
            head = newNode;

        }
        else {
            Node current = head;
            while (current!=null && index-1>0) {

                current = current.next;

                index--;

            }
            if (current==null) return;

            newNode.next = current.next;  //von der zwei die nächste node ist 3
            current.next = newNode;   //von der 1 die nächste nochd ist die 2
            

        }


    }






    public void display () {
        Node current = head;
        while (current!=null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }


    









    public void insertSortZwei(int val) {
        Node newNode = new Node(val);
        if (head==null || val<head.val) {
            newNode.next = head;
            head = newNode;

        }


        else {

        Node current = head;

        while ( current.next!=null && current.next.val<val  ) {   //current.next !=null kann es einen nulltpointer-Exception geben
            current =current.next;

        }

        newNode.next = current.next;
        current.next =newNode;
        





        }





    }




    public void  deleteNodeWithPrev(int val) {
        Node newNode = new Node (val);

        if (head.val==val) {
            head = head.next;


        }


        else {
            Node current = head;
            Node prev = null;
            while (current!=null && current.val!=val) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;


            




        }





    }








    //problem hier ist, dass  das multiplikate nicht gelöscht werden








    public static void main(String[] args) {
        LinkedList liste = new LinkedList();
        liste.insertAtTheBeginning(5);
        // liste.insertAtTheBeginning(3);
         liste.insertAtTheBeginning(-1);
          liste.insertAtTheBeginning(-1);
         liste.insertAtTheEnd(8);
         liste.insertSorted(2);
          liste.insertSorted(2);
          liste.insertSortZwei(9);
        //   liste.deleteNodeWithPrev(9);
        liste.deleteNode(0);
          
        //  liste.deleteNode(2);
        // liste.deleteAtGivenIndex(5);
        //  boolean a = liste.doesNodeExist(2,2);
        //  int b = liste.searchNodeIndex(9);
        //  System.out.println(b);
        //  System.out.println(a);
        // liste.insertAtGivenIndex(3, 0);
        
        liste.display();
    }
}
