package Sortiert.AchteLektion;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class StringMethoden {
    public static void main(String[] args) throws IOException
 {
 String seite = "<body id=\"www-wikipedia-org\">"
 + "<div class=\"central-textlogo\">"
 + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
 + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
 + "</div>"
 + "</body>";

    int a = seite.indexOf("src");
    int indexAnfangVonString = a+5;
 

    int b = seite.indexOf("/b/bb");
    int indexEndevonString = b-1;
    

    String ausgeschnitteUrl = seite.substring(indexAnfangVonString, indexEndevonString+1);
    System.out.println(ausgeschnitteUrl);
 //index of "src" +3 
 String downloadUrl = ausgeschnitteUrl;
    URL url = new URL("\""+downloadUrl + "\"");
    BufferedImage image = ImageIO.read(url);
    ImageIO.write(image, "png", new File("bild.png"));
 }
    
}
