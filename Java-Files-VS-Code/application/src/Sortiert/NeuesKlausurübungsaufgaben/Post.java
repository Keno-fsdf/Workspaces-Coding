package Sortiert.NeuesKlausurübungsaufgaben;

public class Post { 
    String text; Post next;
    String absender; 
    String empfänger;
    
    public Post (String text, String absender, String empfänger) { 
    this.text = text; 
    this.absender = absender;
    this.empfänger = empfänger;  }}
