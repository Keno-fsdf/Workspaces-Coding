package Sortiert.ZwölfteLektion.Übung;

public class BinärBäumchen {
    Knoten root;

    BinärBäumchen() {

        this.root =null;
    }




    public void einfuegen(int val) {
        root = einfuegenHelper(val, root);





    }
    
    private Knoten einfuegenHelper (int val,Knoten root) {

        if (root==null) {
            root = new Knoten(val);
            return root;

        }
        if (val<root.val) {
             root.left = einfuegenHelper(val, root.left);

        }
        else{

             root.right = einfuegenHelper(val, root.right);


        }
        return root;






    }



    public void display() {
        displayHelper(root);

    }


    private void displayHelper(Knoten root) {
        if (root!=null) {
            displayHelper(root.left);
            System.out.println(root.val);
            displayHelper(root.right);


        }

    }


    public void deleting(int val) {
        root = deletingHelper(root, val);

    }

    public Knoten deletingHelper(Knoten root, int val) {

        if (root==null) {
            System.out.println("Wert wurde nicht gefunden");
            return null;

        }

        if (val<root.val)  {
            root.left = deletingHelper(root.left, val);

        }
        else if (val>root.val) {
            root.right = deletingHelper(root.right, val);

        }

        else {
            if (root.right==null) {
                return root.left;

            }
            else if (root.left==null) {
               return root.right;

            }
            else {

                root.val = minValue(root.right);

                root.right = deletingHelper(root.right, root.val);




            }





        }
        










        return root;




    }


    private int minValue(Knoten root) {
        int ergebnis = 0;
        while (root!=null) {
            ergebnis = root.val;

            root = root.left;

        }



        return ergebnis;

    }





    //display Methode




























    
}
