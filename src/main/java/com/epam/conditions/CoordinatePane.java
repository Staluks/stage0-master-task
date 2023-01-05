package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        boolean xPositive = x > 0;
        boolean yPositive = y > 0;
        if(x == 0 && y == 0){
            System.out.println("zero");
        }else{
            if (xPositive) {
                if (yPositive) {
                    System.out.println("first");
                } else {
                    System.out.println("fourth");
                }
            }else {
                if (yPositive) {
                    System.out.println("second");
                } else {
                    System.out.println("third");
                }
            }
        }

    }

}

