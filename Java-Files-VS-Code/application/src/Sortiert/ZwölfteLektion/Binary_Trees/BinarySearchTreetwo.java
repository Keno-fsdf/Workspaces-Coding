package Sortiert.ZwölfteLektion.Binary_Trees;


//Erstellung der Nodes

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

//Erstellung des Trees
public class BinarySearchTreetwo {
    private TreeNode root;

    public BinarySearchTreetwo() { //Also den Konstruktor könnte man auch weglassen
        root = null;  //root = null müssen wir nicht unbedingt machen, weil root auch automatisch "null" ist, wenn man nichts zuweist. 
    }





//Methoden des Trees




    //Wir haben eine Lokale Root an der wir gerade arbeiten und einer root die schon am Baum anliegt




    // Einfügen eines Elements
    public void insert(int key) {
        root = insertRec(root, key);    // das steht jetzt bascically      root = root       -->Und das rechte ist jetzt 4       also steht da   root = 4;
    }

    private TreeNode insertRec(TreeNode root, int key) {
        //Wenn es beim Baum noch gar nichts gibt, dann ist automatisch die Wurzel ganz oben der erste wert
        
        if (root == null) {
            root = new TreeNode(key);
            return root;   //root = 4
        }



        //Wenn es beim Baum schon eine Wurzel gibt:



        if (key < root.key) {   //Wenn der neue wert (key) kleiner als der Wert der Wurzel ist, dann müssen wir links gehen im Baum
            //root.left ist wie ein Pfeil auf das linke Node 
            
            //root.left = insertRec (root.left, 2)  -->root.left ist hier "null" , ABER wir übergeben mit diesem null auch den Wert 2.  Und weil es Null ist, also dort kein Node bist jetzt ist, können wir dort unsere neuen Node hinmachen
            //Siehe oben, immer erst, wenn root==null ist wird ein neues Node erstellt und dann wird dieses "null"-Node     zu unserem neuen Node was wir erstellt haben


            //Wenn root.left, aber NICHT null ist, also ein Node links von der root ist, dann gehen oben wir nicht in dieses if-Statement rein (root==null) und wir wiederholen den Vorgang und gehen sozusagen mit dem "Pointer" also der Root
            //eins weiter im Baum und überprüfen dann ob der root.left wert null ist und wenn ja, dann erstellen wir dort ein neues Node und wenn nein, dann wiederholen wir wieder den Prozess
            

            //Wir müssen in unterprogrammen/ in dimensionen denken
            //Hier steht also root.left = 2
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root; // das hier muss ich noch beachten



        //die rekursivion immer als seperates programm sehen!!
        //die rekursivion immer als seperates programm sehen!!
    }

























    //Komplett es hier neu coden

    public void insertANod (int key) {
        root = insertANodeHelper(root, key);




    }

    private TreeNode insertANodeHelper (TreeNode root, int key){

        if (root ==  null ) {
            root = new TreeNode(key);

        }




        else if (key < root.key) {
            root.left = insertANodeHelper(root.left, key);


        }

        else if (key> root.key) {
            root.right = insertANodeHelper(root.right, key);
        }


        //hier wurden sozusagen die Pointers dann "erstelllt bzw. geupdated"



        return root;
    }


    























    public void einfügen(int val) {
        helferEinfügen(root, val);



    }

    public void helferEinfügen (TreeNode root, int key) {
        
        

        if (root==null) {
            root = new TreeNode(key);
            return;
        }


        else if (key<root.key) {
            helferEinfügen(root.right, key);


        }

        else if (key>root.key) {
            helferEinfügen(root.left, key);


        }

        



        




    }































    //Jetzt nochmal das ganze iterativ nochmal coden

    public void insertNodIterativ(int key) {

        TreeNode newNode = new TreeNode(key);


        if (root==null) {
            root = newNode;
            return;

        }


        TreeNode current = root;
        TreeNode parent = null; //ist wie prev

        while (current!= null) {
            parent = current;

            if (key <current.key) {
                current = current.left;
            }
            else if (key >current.key) {
                current = current.right;
            }
            //Wenn es den Wert schon gibt, dann mach halt einfach gar nichts
            else {
                return;
            }




        }
        if (key<parent.key) {
            parent.left = newNode;

        }
        else {
            parent.right = newNode;
        }








        // if (key<root.key){
        //     TreeNode current = root;

        //     //wir müssen das ende links finden
        //     while (current.left!=null && key<current.key) {
        //         current = current.left;
        //     }

        //     current.left = newNode;


        // }





    }

















    // Suche nach einem Element
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(TreeNode root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }

        if (key < root.key) {
            return searchRec(root.left, key);
        }

        return searchRec(root.right, key);
    }











    // Inorder Traversierung
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }





















































    // Entfernen eines Elements

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // Element mit einem Kind oder ohne Kind
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            // Element mit zwei Kindern: den kleinsten Wert im rechten Teilbaum finden
            root.key = minValue(root.right);

            // Den kleinsten Wert im rechten Teilbaum löschen
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    private int minValue(TreeNode root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }







    public static void main(String[] args) {
        BinarySearchTreetwo tree = new BinarySearchTreetwo();


        //bei dieser InsertMethode akzeptierten wir kein doppelten werte
        tree.insertNodIterativ(4);
        tree.insertNodIterativ(2);
        tree.insertANod(6);
        tree.insertANod(0);
        tree.einfügen(3);
        // tree.delete(4);
        // tree.insert(20);
        // tree.insert(40);
        // tree.insert(70);
        // tree.insert(60);
        // tree.insert(80);

        System.out.println("Inorder Traversierung:");
        tree.inorder();

        // int keyToDelete = 40;
        // System.out.println("\nLösche " + keyToDelete);
        // tree.delete(keyToDelete);
        // tree.inorder();
    }
}
    

