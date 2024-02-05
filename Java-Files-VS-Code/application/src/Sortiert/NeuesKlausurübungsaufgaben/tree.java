package Sortiert.NeuesKlausurübungsaufgaben;

public class tree {
    Node root;


    public void insertNode (String wort, String bedeutung) {
        Node neueNode = new Node (wort, bedeutung);
        root = insertHelper(root,neueNode ); 


    }   

    public Node insertHelper (Node root, Node neueNode) {
        if (root==null) {
            root = neueNode;
            return root;

        }

        else if (neueNode.wort.compareTo(root.wort)<0) {
            root.left = insertHelper(root.left, neueNode);

        }
        else {
            root.right = insertHelper(root.right, neueNode);
        }
        return root;

    }


}
