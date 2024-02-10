package Sortiert.Leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
    
        String kürzestesWort = strs[0];
    
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < kürzestesWort.length()) {
                kürzestesWort = strs[i];
            }
        }
    
        int buchstabenLängeDirWirAbfragenMüssen = kürzestesWort.length();
    
        StringBuilder ergebnis = new StringBuilder();
    
        for (int j = 0; j < buchstabenLängeDirWirAbfragenMüssen - 2; j++) {
            char char1 = kürzestesWort.charAt(j);
            char char2 = kürzestesWort.charAt(j + 1);
            char char3 = kürzestesWort.charAt(j + 2);
    
            if (char1 == char2 && char2 == char3) {
                ergebnis.append(char1);
            }
        }
    
        System.out.println(ergebnis.toString());
    }
    
}
