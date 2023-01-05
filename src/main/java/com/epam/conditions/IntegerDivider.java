package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int div;
        boolean dividable;
        if (divider == 0){
            System.out.println("division by zero");
        }else{
            div = dividend/divider;
            dividable = div*divider == dividend;
            if (dividable){
                System.out.println("can be divided completely");
            } else{
                System.out.println("cannot be divided completely");
            }
        }
    }

}
