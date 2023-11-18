package Sortiert.Leetcode;

public class MergeStringsAlternately {
    

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        int lengthWord1 = word1.length();
        char[] wort1 = word1.toCharArray();
        char[] wort2 = word2.toCharArray();

        int lengthWord2 = word2.length();

        int alternationLength = Math.min(lengthWord1, lengthWord2);
        boolean word1IsLonger = (lengthWord1 > lengthWord2);

        String result = "";
        int i = 0;
        while (i < alternationLength) {
            result += wort1[i];
            result += wort2[i];
            i++;
        }

        // Append the remaining characters from the longer word
        if (word1IsLonger) {
            while (i < lengthWord1) {
                result += wort1[i];
                i++;
            }
        } else {
            while (i < lengthWord2) {
                result += wort2[i];
                i++;
            }
        }

        System.out.println(result);
    }}