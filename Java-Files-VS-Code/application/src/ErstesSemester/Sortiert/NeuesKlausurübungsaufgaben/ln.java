package Sortiert.NeuesKlausurübungsaufgaben;

public class ln {
    

 
public static double lns(double x ){
    if (x <= 0 || x >= 2){
        throw  new RuntimeException();
    }

    double result = 0;
    double cResult = x;

    int n = 0;

    while (cResult >= 1E-16){
        n += 1;
        cResult = (pow(-1, (n + 1)) / n) * pow(x - 1, n);

        result += cResult;
    }

    return result;
}


public static double pow(double b, int e){
    double result = 1;

    for (int i = 0; i < e; i++){
        result *= b;
    }

    return result;
}
}

