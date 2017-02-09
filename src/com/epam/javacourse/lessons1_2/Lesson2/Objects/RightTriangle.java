package com.epam.javacourse.lessons1_2.Lesson2.Objects;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class RightTriangle {
    int cathetus1, cathetus2;

    public RightTriangle(Integer cat1, Integer cat2) {
        this.cathetus1 = cat1;
        this.cathetus2 = cat2;
    }

    public double getHypotenuse() {
        return Math.sqrt(cathetus1 * cathetus1+ cathetus2 * cathetus2);
    }

    public double getSquare() {
        return 0.5 * cathetus1 * cathetus2;
    }
}

