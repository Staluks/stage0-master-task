package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reverseNum = 0;
        int reminderFirst = number % 10;
        reverseNum = reverseNum * 10 + reminderFirst;
        int numbertwo = number / 10;

        int reminderSecond = numbertwo % 10;
        reverseNum = reverseNum * 10 + reminderSecond;
        int numberThird = numbertwo / 10;

        int reminderthird = numberThird % 10;
        reverseNum = reverseNum * 10 + reminderthird;
        System.out.println(reverseNum);
    }

}
