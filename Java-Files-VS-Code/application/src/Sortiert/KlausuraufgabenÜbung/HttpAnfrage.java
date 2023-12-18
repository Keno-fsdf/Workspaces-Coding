package Sortiert.KlausuraufgabenÜbung;

public class HttpAnfrage {

    String url;
    String methode;
    String[] headers = new String[20];

    public HttpAnfrage(String url, String methode) {
        if (methode.equals("GET") || methode.equals("POST")) {
            this.methode = methode;
        } else {
            this.methode = "GET";
        }
        this.url = url;
    }

    public void addHeader(String header) {
        int i = 0;
        while (i < 20 && headers[i] != null) {
            i++;
        }
        headers[i] = header;
    }

    @Override
    public String toString() {
        String ausgabe = methode + " " + url + " HTTP/1.0";
        for (int i = 0; i < headers.length; i++) {
            if (headers[i] != null) {
                ausgabe += "\n" + headers[i];
            }
        }
        return ausgabe;
    }
}

