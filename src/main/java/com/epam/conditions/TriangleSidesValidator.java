package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean triangle;

        triangle = firstSide >= secondSide && firstSide >= thirdSide ? firstSide < secondSide+thirdSide :
                secondSide >= thirdSide ? secondSide < thirdSide+firstSide: thirdSide < firstSide+secondSide;

        System.out.println(triangle? "this is a valid triangle": "it's not a triangle");
    }

}
