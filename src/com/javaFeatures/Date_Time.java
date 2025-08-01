package com.javaFeatures;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[]args){
        LocalDate date = LocalDate.now();
        System.out.println("Date : " + date );

        LocalTime time = LocalTime.now();
        System.out.println("Time : " + time );

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Date and time : " + dt);

        //custom date and time
        LocalDate date1 = LocalDate.of(2023,12,23);
        System.out.println(date1);

        //format date
        LocalDate d = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd - MM - yy");
        String formattted = d.format(format1);
        System.out.println(formattted);

        //add/subtract

        LocalDate add = LocalDate.now().plusYears(3);
        System.out.println(add);

        LocalDate sub = LocalDate.now().minusYears(3);
        System.out.println(sub);

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(1999,4,25);
        Period p =  Period.between(d2, d1);
        System.out.println(p.getYears() + " Months : " + p.getMonths() + " Days : " + p.getDays());
    }
}
