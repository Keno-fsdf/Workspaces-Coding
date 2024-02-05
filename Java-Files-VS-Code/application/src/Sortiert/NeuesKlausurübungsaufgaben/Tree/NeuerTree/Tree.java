package Sortiert.NeuesKlausurübungsaufgaben.Tree.NeuerTree;

import Sortiert.NeuesKlausurübungsaufgaben.reihen;

public class Tree {
    Node root;
    
    public void einfugen(int data) {
    Node neueNode = new Node (data);
    
    root = einfugenHelper(root, neueNode); }
    
    public Node einfugenHelper(Node root, Node neueNode) {
    
    if (root==null) {
    root = neueNode;
    return root; }
    
    else if (neueNode.data<root.data) {
    root.left = einfugenHelper(root.left, neueNode);
    }
    
    else {
    root.right = einfugenHelper (root.right,neueNode);
    }
    
    return root; }
    
    public void display()  {
    displayHelper(root); }
    
    public void displayHelper (Node root) {
    if (root==null) return;
    displayHelper(root.left);
    System.out.println(root.data);
    displayHelper(root.right); }
    
    
    
    public boolean suche( int data) {
    return sucheHelper(root, data);  }
    
    public boolean sucheHelper(Node root, int data) {
    if (root==null) return false;
    else if (data ==root.data) return true;
    else if (data<root.data) {
    return sucheHelper (root.left, data); }
    
    else {return sucheHelper (root.right, data); }




}


    public static void main(String[] args) {
        // Erstellen Sie eine Instanz des Baums
        Tree tree = new Tree();

        // Fügen Sie einige Elemente ein
        tree.einfugen(5);
        tree.einfugen(3);
        tree.einfugen(7);
        tree.einfugen(2);
        tree.einfugen(4);
        tree.einfugen(1);
        tree.einfugen(8);

        // Zeigen Sie den Baum an
        System.out.println("In-Order Traversal:");
        tree.display();

        // Suche nach einem Element
        int searchElement = 6;
        if (tree.suche(searchElement)) {
            System.out.println("Das Element " + searchElement + " wurde gefunden.");
        } else {
            System.out.println("Das Element " + searchElement + " wurde nicht gefunden.");
        }
    
}


}
    
    
    