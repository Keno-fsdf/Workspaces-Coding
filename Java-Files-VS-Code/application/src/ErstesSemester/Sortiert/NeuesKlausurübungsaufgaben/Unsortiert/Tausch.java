package Sortiert.NeuesKlausurübungsaufgaben.Unsortiert;
public class Tausch
{
  public static void main(String[] args)
  {
    int x = 5;
    int y = 7;
    //Vor dem Tausch

    System.out.println(x);
    System.out.println(y);

    //Eine neue Variable erstellen, damit ich diese als Zwischenspeicher für die Variablen verwenden kann
    int zwischenspeicher; 

    zwischenspeicher = x;   //Jetzt kann ich in die Variable "x" = "y" machen, weil "x" ja im zwischenspeicher gespeichert ist 
    x = y;
    y = zwischenspeicher;  //jetzt nehmen wir die Variable aus dem Zwischenspeicher wieder und geben diesen "y"
    //Tausch
    //Nach dem Tausch
    System.out.println(x);
    System.out.println(y);
  }
}   