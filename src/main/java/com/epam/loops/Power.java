package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int result = 0;
        int prevResult = 1;
        for(int i = 1; i<=power; i++){

            result = prevResult * numberToPrint;
            prevResult = result;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
