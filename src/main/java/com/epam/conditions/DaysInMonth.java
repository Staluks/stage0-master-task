package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int january = 31;
        int february = 28;
        int march = 31;
        int april = 30;
        int may = 31;
        int june = 30;
        int july = 31;
        int august = 31;
        int september = 30;
        int october = 31;
        int november = 30;
        int december = 31;
        boolean leapYear = year%4 ==0 &&(year%100 !=0 | year%400 ==0);
        if(leapYear){
            february = 29;
        }
        if (year>0){
            switch (month){
                case 1 -> System.out.println(january);
                case 2 -> System.out.println(february);
                case 3 -> System.out.println(march);
                case 4-> System.out.println(april);
                case 5-> System.out.println(may);
                case 6-> System.out.println(june);
                case 7-> System.out.println(july);
                case 8-> System.out.println(august);
                case 9-> System.out.println(september);
                case 10-> System.out.println(october);
                case 11-> System.out.println(november);
                case 12-> System.out.println(december);
                default -> System.out.println("invalid date");
            }
        }else {System.out.println("invalid date");}
    }

}
