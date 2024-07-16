package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date specificDate = calendar.getTime();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf1.format(specificDate)); //19/05/2016

        Calendar today = Calendar.getInstance();
        Date specificDate2 = today.getTime();
        System.out.println(specificDate2); //Tue Jul 16 15:05:28 CEST 2024
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");
        System.out.println(sdf2.format(specificDate2)); //16/07/2024 15:07:914

    }
}
