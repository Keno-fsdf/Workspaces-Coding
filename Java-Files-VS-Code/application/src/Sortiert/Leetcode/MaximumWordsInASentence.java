package Sortiert.Leetcode;

public class MaximumWordsInASentence {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int [] längeWörter = new int[sentences.length];

        for (int i = 0; i<sentences.length; i++) {
        String satz = sentences[i];
        char[] liste = satz.toCharArray();
        int anzahlWörter = 1;

        for (int j = 0; j<liste.length; j++){

        if (liste[j]==32) anzahlWörter++;

        }

    längeWörter [i] = anzahlWörter;}
    bubbleSort(längeWörter);
    // for (int element: längeWörter) System.out.println(element + " ");
    // return längeWörter[0];
    }






//jetzt wieder ein bubble-sort algo
//der erste wert ist dann der größte

public static void bubbleSort (int[] array) {
for (int z = 0; z<array.length; z++) {

for (int y = 1+z; y<array.length; y++) {
	if (array[z]<array[y]) {
	int zwischenspeicher = array[z];
	array[z] = array[y];
	array[y] = zwischenspeicher;
	}
}
    
}
}}