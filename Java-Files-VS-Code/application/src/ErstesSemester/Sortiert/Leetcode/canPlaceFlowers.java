package Sortiert.Leetcode;

public class canPlaceFlowers {
    public static void main(String[] args) {
        int []flowerbed = {0,0};
        int n = 2;


        // System.out.println(flowerbed.length);
    int zählerFürTripleZero = 0;
    for (int j = 0; j+3<flowerbed.length; j++){   //länge = 4
    boolean alleDreiNullen = (flowerbed[0+j] ==0 && flowerbed[1+j] ==0 && flowerbed[2+j] ==0);
    if (alleDreiNullen==true&&flowerbed[3+j]==0) j++;
    if (alleDreiNullen==true) zählerFürTripleZero++;
  

    }


    if (flowerbed.length>=2) {
     int letzerIndexDerListe = flowerbed.length-1;
    int vorletzerIndexDerListe = flowerbed.length-2;
    if (flowerbed[letzerIndexDerListe] ==0 && flowerbed[vorletzerIndexDerListe]==0) zählerFürTripleZero++;
    if (flowerbed[0]==0 && flowerbed[1] ==0) zählerFürTripleZero++;  //+1
    if ((flowerbed[letzerIndexDerListe] ==0 && flowerbed[vorletzerIndexDerListe]==0) &&  (flowerbed[0]==0 && flowerbed[1] ==0)) zählerFürTripleZero--;
}
       
    if (flowerbed.length==1) {
        if (flowerbed[0]==0) zählerFürTripleZero++;
    }

    System.out.println(zählerFürTripleZero);
    boolean rückgabe = false;
    if (zählerFürTripleZero>=n) rückgabe = true;

    System.out.println(rückgabe);
}
}
