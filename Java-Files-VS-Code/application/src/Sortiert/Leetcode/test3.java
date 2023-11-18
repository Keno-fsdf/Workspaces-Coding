package Sortiert.Leetcode;

public class test3 {
    public static void main(String[] args) {
        int [] [] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));


    }

    public static int maximumWealth(int[][] accounts) {
        int[] unsortierteListe = new int[accounts.length];
        int j = 0;
        
        // Iteriere über die äußere Liste (Kunden)
        for (int[] kunde: accounts) {
            int summe = 0;
            
            // Iteriere über die innere Liste (Bankkonten des Kunden)
            for (int i = 0; i < kunde.length; i++) {
                summe = summe + kunde[i];
            }
            
            unsortierteListe[j] = summe;
            j++;
        }
        for (int elementes: unsortierteListe) System.out.println(elementes + " ");
        // Finde das Maximum in der Liste
        int maxWealth = Integer.MIN_VALUE;
        for (int kundenVermögen: unsortierteListe) {
            maxWealth = Math.max(maxWealth, kundenVermögen);
        }
        
        return maxWealth;
    }
    
}
