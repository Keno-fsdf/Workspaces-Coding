package Sortiert.Leetcode;

import java.util.Stack;

public class ValidParenthese {

    public static void main(String[] args) {

        //Die einzigen Sachen die in der Eingabe stehen können sind eine Kombination von '(' und ')'
        String eingabe = "(()())";
        char[] eingabeArray = eingabe.toCharArray();
        
        Stack<Character> stack = new Stack<>();  //creating a stack

        for (char zeichen: eingabeArray) {
            if (zeichen=='(') {
                stack.push(')');

            }
            else if  (zeichen==')' && !stack.isEmpty()) {
                stack.pop();
            }

  
            


        }
       
        System.out.println("Handelt es sich um eine valide Klammereingabe: " + stack.isEmpty());

    }

    
}
