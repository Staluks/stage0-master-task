package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int i =1; i<=cathetusLength; i++){
            StringBuilder pyramid = new StringBuilder();
            for(int a =1 ; a<=(cathetusLength*2)-1; a++){
                if(a<(cathetusLength+1)-i || a>(cathetusLength-1) +i){
                    pyramid.append(" ");
                }else if (cathetusLength + 1 > a) {
                    pyramid.append((cathetusLength + 1) - a);
                } else {
                    pyramid.append((a + 1) - cathetusLength);
                }
            }
            System.out.println(pyramid);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
