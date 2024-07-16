package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(dateFormat.format(date)); //16/07/2024

        // On commence à 1900 (2016-1900)
        Date dateS = new Date(116, 4, 19, 23, 59, 30);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        System.out.println(dateFormat2.format(dateS)); //19/05/2016 23:59:30

        // Date system
        Date systemDate = new Date();
        System.out.println(systemDate); // Tue Jul 16 15:01:07 CEST 2024
    }
}
