package Sortiert.Leetcode;

import java.util.Stack;

public class ValidParentheseEASY {
    public static void main(String[] args) {
        //Überprüft ob die Klammern-Eingabe valide ist, aber diesmal sind auch andere Buchstaben dazwischen
        

        String eingabe = "(co(de)(Hallo))";
        char[] eingabeArray = eingabe.toCharArray();
        boolean zuVieleZeichen =false;
        Stack<Character> stack = new Stack<>();  //creating a stack

        for (char zeichen: eingabeArray) {
            if (zeichen=='(') {
                stack.push(')');

            }
            else if  (zeichen==')' && !stack.isEmpty()) {
                stack.pop();
            }

            else if (zeichen==')' && stack.isEmpty()) {
                zuVieleZeichen =true;

            }
            


        }
        boolean ergebnis = stack.isEmpty() && zuVieleZeichen== false;

        System.out.println("Handelt es sich um eine valide Klammereingabe: " + ergebnis);


    }
    
    
}
