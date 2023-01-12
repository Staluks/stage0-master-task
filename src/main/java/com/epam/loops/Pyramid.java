package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for(int i =1; i<=cathetusLength; i++){
            String pyramid = "";
            for(int a =1 ; a<=(cathetusLength*2)-1; a++){
                if(a<(cathetusLength+1)-i || a>(cathetusLength-1) +i){
                    pyramid +=" ";
                }else if (cathetusLength + 1 > a) {
                    pyramid += ((cathetusLength + 1) - a);
                } else {
                    pyramid += ((a + 1) - cathetusLength);
                    break;
                }
            }
            System.out.println(pyramid);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
