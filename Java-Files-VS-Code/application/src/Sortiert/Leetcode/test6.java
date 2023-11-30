package Sortiert.Leetcode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test6 {
    public static void main(String[] args) {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));

    }
    
}
