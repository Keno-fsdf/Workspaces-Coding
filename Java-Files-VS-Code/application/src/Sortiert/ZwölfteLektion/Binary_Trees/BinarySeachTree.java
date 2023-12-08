package Sortiert.ZwölfteLektion.Binary_Trees;

import java.util.Stack;

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


















    public void einfugen(Node node) {
        


    }















//Inorder-Traversal rekursiv coden


public void inorder_Traversal () {
    helfer(root);




}


public void helfer (Node root) {
    if (root!=null) {
    helfer(root.left);
    System.out.println(root.data);
    helfer(root.right);
    }
}





















    public void InorderTraversalIrative() {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            //2. durchlauf: current = null;
            //3. durchlauf: current = 3;
            //4. durchlauf: current = 4;
            //5. durchlauf current = 6
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            //current = null; -->Hier ist bei egal welchem durchlauf current = null


          
            current = stack.pop();  //current = 1    //Zweiter Durchlauf: current = 2  //Dritter Durchlauf: current = 3;  //Vierter Durchlauf current = 4;
            //print 1  // Zweiter Durchlauf: print 2 //Dritte Durchlauf: print 3  //Vierter Durchlauf: print 4
            System.out.print(current.data + " ");
            current = current.right;
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
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) return false;
        else if (root.data == data) return true;
        else if (data < root.data) return searchHelper(root.left, data);
        else return searchHelper(root.right, data);
    }

























    public boolean suche(int key) {
        return sucheHelfer(key, root);




    }

    public boolean sucheHelfer(int key, Node root) {
        if (root==null) return false;
        else if (root.data == key) return true;
        else  {
            return sucheHelfer(key, root.left) || sucheHelfer(key, root.right);}


      




    }






    





















    public void remove(int data) {

         // Schritt 1: Überprüfen, ob der Wert im Baum vorhanden ist

        //Schritt 1.1: Ja der Wert exisitiert im Baum
        if (search(data))  //Ja der WErt existiert
         {
            //Schritt 2: Entferne den Wert. -->Jetzt müssen wir aber zunächst erst wieder den wert finden
            root = removeHelper(root, data);
        } 
        
        
        //Schritt 1.2  NEIN der Wert exisitert nicht im Baum und kann somit auch nicht entfernt werden
        else {
            System.out.println("The value to be removed does not exist in the binary tree.");
        }
    }

    private Node removeHelper(Node root, int data) {
        //2.1 wenn es keine Wurzel gibt, ja dann können wir auch nichts entfernne und deswegen return null;
        if (root == null) {
            return null;
        //2.2 Wir gehen nach links im Baum soweit wie möglich, bzw. bis wir den Wert gefunden haben oder rechts abbiegen müssen

        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);

        //2.3 Wir gehen soweit nach rechts wie möglich bis wir den Wert final gefunden haben

        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);



        //Jetzt haben wir den Wert rekursiv gefunden und erst jetzt geht der code in dieses else statement 
        //Entfernung des eigentlichen Wertes/Nodes passiert erst ab hier:



        } else {
            //Hat die root ein Kind?

            //Ist dieses Kind das Rechts Kind?
            if (root.left == null) {
                return root.right; //Dann geh zum rechten Kind

            //Ist dieses Kind das Linke Kind?    
            } else if (root.right == null) {
                return root.left; //Dann geh zum linken Kinden

            



            //Hat die root zwei Kinder????    
            } else {
                // Node with two children: Get the inorder successor (smallest in the right subtree)

                root.data = findMin(root.right); //jetzt müsen vom rechten Kind den kleinsten Wert finden
                
                // Delete the inorder successor
                root.right = removeHelper(root.right, root.data);
            }
        }
        return root;
    }

    private int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

      
    


}
