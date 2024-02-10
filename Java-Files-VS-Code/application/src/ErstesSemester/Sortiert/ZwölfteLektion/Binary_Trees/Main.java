package Sortiert.ZwölfteLektion.Binary_Trees;

public class Main {
    public static void main(String[] args) {
        
    
        BinarySeachTree tree = new BinarySeachTree();
        tree.insert(new Node(4));
        tree.insert(new Node(2));
        tree.insert(new Node(1));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(5));
        tree.insert(new Node(7));
        System.out.println(tree.suche(7));
        // tree.displayReverse();
        tree.remove(4);

        tree.inorder_Traversal();
        // System.out.println(tree.search(5));

           
    }
}
