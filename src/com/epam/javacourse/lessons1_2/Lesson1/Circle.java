package com.epam.javacourse.lessons1_2.Lesson1;

/**
 * Created by Natallia_Lahun on 02/08/2017.
 */
public class Circle {
    private final Integer radius;

    public Circle(Integer r) {
        this.radius = r;
    }

    public double getCircuit() {
        return 2*Math.PI*radius;
    }

    public double getSquare() {
        return Math.PI*Math.pow(radius, 2);
    }

}
