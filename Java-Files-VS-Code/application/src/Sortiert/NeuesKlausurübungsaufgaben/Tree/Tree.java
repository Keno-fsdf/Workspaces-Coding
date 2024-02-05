package Sortiert.NeuesKlausurübungsaufgaben.Tree;

public class Tree {
    Node root;
    
    public void einfugen (int data) {
    Node neueNode = new Node(data);
    root = einfugenHelper(root, neueNode);
    
    }
    
    public Node einfugenHelper(Node root, Node neueNode) {
    if (root==null) {
    root = neueNode;
    return root; }
    else if (neueNode.data<root.data) {
    root.left = einfugenHelper(root.left, neueNode);
    }
    else {
    root.right = einfugenHelper(root.right, neueNode); }
    return root;
    
    }

    public void display() {
        displayHelper(root);
    }

    public void displayHelper(Node root) {
        displayHelper(root.left);
        System.out.println(root.data);
        displayHelper(root.right);


    }


}
    
    
    