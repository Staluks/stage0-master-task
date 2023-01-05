package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int firstCount = number%10;
        int secondCount = (number/10)%10;
        int thirdCount = (number/100)%10;
        int fourthCount = (number/1000)%10;
        int sum = firstCount+secondCount+thirdCount+fourthCount;
        System.out.println(sum);
    }

}
