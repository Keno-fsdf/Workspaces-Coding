package Sortiert.ZwölfteLektion.ZweiteAufgabe;

import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Baum {
    Nodes root;




    public void insert(String wort, String bedeutung) {
        root = insertHelper(root, wort, bedeutung);


    }

    private Nodes insertHelper(Nodes root , String wort, String bedeutung) {
        if (root==null) {
            return new Nodes(wort, bedeutung);

        }
        if (wort.compareTo(root.wort)<0) {

            root.left = insertHelper(root.left, wort, bedeutung);
        }
        else if (wort.compareTo(root.wort)>0) {

            root.right = insertHelper(root.right, wort, bedeutung);
        }

        return root;





    }


public void display() {

    displayHelper(root);

}

    private void displayHelper(Nodes root) {
    if (root!=null) {
    displayHelper(root.left);
     System.out.println("Wort: "+root.wort+ "\t Bedeutung: " + root.bedeutung);
    displayHelper(root.right);
    }
}




public void displayIratively() {
    if (root==null) {
        System.out.println("Der Baum hat keine Elemente!!"); return;}

    Stack <Nodes>  stack = new Stack<>();
    
    Nodes current = root;
    while (current!=null || !stack.isEmpty()) {   
    while (current!=null) {
        stack.push(current);
        
        current = current.left;
    }

    current = stack.pop();

    System.out.println("Wort: "+current.wort+ "\t Bedeutung: " + current.bedeutung);

    current = current.right;

}

    


}




public String search(String wort) {

    String rückgabe = searchHelper(root, wort);
    if (rückgabe==null) System.out.println("Wort wurde NICHT gefunden");
    else System.out.println("Wort wurde gefunden");



    return rückgabe;


}

private String searchHelper(Nodes root, String wort) {

    if (root==null) return null;

    else if (root.wort.compareTo(wort)==0) return root.bedeutung;

    else if (root.wort.compareTo(wort)<0) return searchHelper(root.right, wort);

    else return searchHelper(root.left, wort);


}




 public void delete(String wort) {
        root = deleteRec(root, wort);
    }

    private Nodes deleteRec(Nodes root, String wort) {
        if (root == null) {
            System.out.println("Wert wurde nicht gefunden" + wort);
            return root;
        }

        // Durchsuche den Baum, um den zu löschenden Node zu finden
        if (wort.compareTo(root.wort) < 0) {
            root.left = deleteRec(root.left, wort);

        } else if (wort.compareTo(root.wort) > 0) {
            root.right = deleteRec(root.right, wort);

        
         //Wir haben den node gefunden, den wir löschen wollen

        } else {
            // Node mit nur einem Kind oder ohne Kind
            if (root.left == null) {
                return root.right;   //root = root.right
            } else if (root.right == null) {
                return root.left;   //root = root.right
            }




            // Node mit zwei Kindern: Finde den kleinsten Node im rechten Teilbaum
            root.wort = minValue(root.right);  //Hier suchen wir aber einfach nur zunächst das kleinste wort
            //-->Ist soziemlich das gleiche wie:     root = root.right(kleinsterWert)

            // Lösche den kleinsten Node im rechten Teilbaum
            root.right = deleteRec(root.right, root.wort);  //der node der gelöscht wird, wird zunächst über rekursion wieder gesucht
            //Hier steht dann root.right = null; -->Und somit haben wir den node gelöscht
            //wir löschen das indem wir dann im oberen teil landen
        }

        return root;
    }

    private String minValue(Nodes root) {
        //wir finden den kleinsten string im teilbaum
        String minValue = root.wort;
        while (root.left != null) {
            minValue = root.left.wort;
            root = root.left;
        }
        return minValue;
    }
}
