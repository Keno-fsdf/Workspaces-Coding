package Sortiert.NeuesKlausurübungsaufgaben;

public class Anfrage {
    String methode;
    String url;
    public Anfrage (String methode, String url) 
    
    
    
    {

    if (!methode.equals("GET") && !methode.equals("POST")) { this.methode = "GET"; }
    else this.methode = methode;
    this.url = url; }



    
    String [] headers = new String[20];
    








    public void addHeader (String header) {
    int i = 0;
    while (i<20) {
    if (headers[i] ==null) {
    headers[i] = header; return;  }
    i++;
}}



    
    @Override
    public String toString () {
    String ergebnis = "";
    ergebnis += this.methode + " " + this.url + " " + "HTTP/1.0" + " \n";
    for (String a : headers) {
    ergebnis += a + "\n";
    }
    return ergebnis;
}


public static void main(String[] args) {
    // Beispiel für die Verwendung der Anfrage-Klasse
    Anfrage anfrage = new Anfrage("GET", "http://www.example.com");

    // Füge einige Header hinzu
    anfrage.addHeader("Content-Type: application/json");
    anfrage.addHeader("Authorization: Bearer abc123");

    // Gib die HTTP-Anfrage aus
    System.out.println("HTTP-Anfrage:");
    System.out.println(anfrage.toString());
}

}

