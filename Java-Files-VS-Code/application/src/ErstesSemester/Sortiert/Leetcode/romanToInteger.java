package Sortiert.Leetcode;

public class romanToInteger {
    public static void main(String[] args) {
        String s = "VI";
        char array[] = s.toCharArray();
        int länge = array.length;
        System.out.println(länge);
        int summe = 0;
        
        for (int i = 0; i < array.length;) {
            if (i + 1 < array.length) {
                if (array[i] == 'I' && array[i + 1] == 'V') { summe += 4; i += 2; }
                else if (array[i] == 'I' && array[i + 1] == 'X') { summe += 9; i += 2; }
                else if (array[i] == 'X' && array[i + 1] == 'L') { summe += 40; i += 2; }
                else if (array[i] == 'X' && array[i + 1] == 'C') { summe += 90; i += 2; }
                else if (array[i] == 'C' && array[i + 1] == 'D') { summe += 400; i += 2; }
                else if (array[i] == 'C' && array[i + 1] == 'M') { summe += 900; i += 2; }
                else {
                if (array[i] == 'I') { summe += 1; i += 1; }
                else if (array[i] == 'V') { summe += 5;i += 1; }
                else if (array[i] == 'X') { summe += 10; i += 1;}
                else if (array[i] == 'L') { summe += 50; i += 1;}
                else if (array[i] == 'C') { summe += 100;i += 1; }
                else if (array[i] == 'D') { summe += 500; i += 1;}
                else if (array[i] == 'M') { summe += 1000;i += 1;}
            }
            } else {
                if (array[i] == 'I') { summe += 1; i += 1; }
                else if (array[i] == 'V') { summe += 5;i += 1; }
                else if (array[i] == 'X') { summe += 10; i += 1;}
                else if (array[i] == 'L') { summe += 50; i += 1;}
                else if (array[i] == 'C') { summe += 100;i += 1; }
                else if (array[i] == 'D') { summe += 500; i += 1;}
                else if (array[i] == 'M') { summe += 1000;i += 1;}
            }
        }
        
        System.out.println(summe);
        
        

    }
    
}
