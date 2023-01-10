package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int i=1; i<=cathetusLength; i++){
            String halfPyramid = "";
            for(int a=1;a<=cathetusLength; a++){
                if(a>cathetusLength-i){
                    halfPyramid += "*";
                }else{
                    halfPyramid += " ";
                }
            }
            System.out.println(halfPyramid);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
