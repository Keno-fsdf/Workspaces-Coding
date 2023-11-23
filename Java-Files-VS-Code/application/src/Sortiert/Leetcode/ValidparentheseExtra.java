package Sortiert.Leetcode;

import java.util.Stack;

public class ValidparentheseExtra {
    public static void main(String[] args) {
        //Macht das gleiche wie der Vorherige Code nur das man jetzt alle drei Klammer eingaben benutzen kann

        String eingabe = "(co(de)(Hallo}))";
        char[] eingabeArray = eingabe.toCharArray();
        boolean zuVieleZeichen =false;
        Stack<Character> stack = new Stack<>();  //creating a stack

        for (char zeichen: eingabeArray) {
            if (zeichen=='(' || zeichen =='[' || zeichen =='{') {
                stack.push(zeichen);

            }
            else if  (zeichen==')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }   
            else if  (zeichen==']' && !stack.isEmpty()&& stack.peek() == '[') {
                stack.pop();
            }
            else if  (zeichen=='}' && !stack.isEmpty()&& stack.peek() == '{') {
                stack.pop();
            }
            else if  ((zeichen=='}' || zeichen==']' ||zeichen==')') && !stack.isEmpty()) {
                zuVieleZeichen=true;
            }

            else if ((zeichen==')' || zeichen==']' || zeichen=='}')&& stack.isEmpty()) {
                zuVieleZeichen =true;

            }
            


        }
        boolean ergebnis = stack.isEmpty() && zuVieleZeichen== false;

        System.out.println("Handelt es sich um eine valide Klammereingabe: " + ergebnis);


    }
}
