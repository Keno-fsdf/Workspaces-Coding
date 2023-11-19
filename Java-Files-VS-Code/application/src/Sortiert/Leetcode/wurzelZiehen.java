package Sortiert.Leetcode;

public class wurzelZiehen {
    public static void main(String[] args) {
    // int eingabe = 10;
    // int ergebnis = 0;

    // for (int i =0; i<=eingabe; i++) {

    //     if (i*i>eingabe) {
    //         ergebnis = i-1; break;
    //     }
    //     else ergebnis = eingabe;
        
    // }
    // System.out.println(ergebnis);



    // int basis = 8;
    // int potenz = 0;
    // int ergebnis = 0;
    // if (potenz==0) ergebnis = 1;
    // for (int i = 0; i<potenz; i++) {
        
    //     if (i==0) { 
    //     ergebnis =basis*basis; i++;}
    //     else ergebnis = ergebnis*basis;

        

    // }
    // System.out.println(ergebnis);


        System.out.println(wurzelZiehe(2));

    }
    
    





























    public static int wurzelZiehe (int eingabes){
    if (eingabes==0||eingabes==1) return eingabes;
    
    for (int i = 0; i<=eingabes; i++) {
        if (i*i>eingabes) return i-1;
      
       

    }
    return eingabes;
}





public static int wurzelZiehe1(int eingabe) {
    if (eingabe == 0 || eingabe == 1) {
        return eingabe;
    }

    for (int i = 0; i <= eingabe; i++) {
        if (i * i > eingabe) {
            return i - 1; // Die Quadratwurzel abrunden
        }
        
    }

    return eingabe; // Fall sollte normalerweise nicht erreicht werden
}
}
