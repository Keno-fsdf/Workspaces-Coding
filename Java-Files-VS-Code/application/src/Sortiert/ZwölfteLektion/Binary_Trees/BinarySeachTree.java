package Sortiert.ZwölfteLektion.Binary_Trees;

public class BinarySeachTree {
    Node root;


    public void insert (Node node) {
        root = insertHelper(root, node);

    }
       private Node insertHelper(Node root, Node node) {
        if (root==null) {
            root = node;
            return root;

        }
        else if (node.data<root.data) {
            root.left = insertHelper(root.left, node); //das ist der Part wo ich aussteigen

        }
        else {
            root.right = insertHelper(root.right, node);

        }


       return root;
    }


    public void display() {
        displayHelper(root);


    }
    private void displayHelper(Node root) {

        if (root!=null) {
            displayHelper(root.left);  //geht solange nach links wie es geht
            System.out.println(root.data);  //printed den wert
            displayHelper(root.right);  //geht solange nach rechts wie es geht

        }


    }

    public void displayReverse() {
        displayHelperReverse(root); //wir machen eine helper funktion, sodass diese hautmethode die eigentlich methode nur einmal aufrufen kann und diese eigentliche Methode sich selber mehrmals aufrufen kann (rekursive)



    }
    private void displayHelperReverse(Node root) {
        //root ist hier eine Art Pointer wie bspw. current oder i
        //displayHelperReverse (root.rigt)  -->Ist bascially das gleiche wie --> root = root.right
        // --> Wie als ob wir den Pointer eins weiter mache -->Wie bei einer Linked List: current = current.next;


        if (root!=null) {
            displayHelperReverse(root.right);  // geht solange nach rechts wie es geht
            //wir müssen uns das wie dimensions bzw. parrallel laufende Programm vorstellen
            //Wenn das unterprogramm  (in dem fall die rekursion) beendet ist, dann läuft das hauptprogramm weiter
            //also wenn die unterdimension schließt dann aber auch nur dann geht das hauptprogramm weiter

            System.out.println(root.data);  // printed den Wert
            displayHelperReverse(root.left);  // geht solange nach links wie es geht

        }


    }

    public boolean search(int data) {

        return false;
    }

    private boolean searchHelper (Node root, int data) {


        return false;
    }



    public void remove(int data) {


    }
    private Node removeHelper (Node root, int data) {
        return null;
    }
    

    private int successor (Node root) { return 0;
    }
    private int predecessor (Node root) { return 0;
    }



}
