package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import com.epam.javacourse.lessons1_2.Lesson1.Objects.Circle;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task17 {
    public static void main(String[] args){
        System.out.println(getResult(5));
        System.out.println(getResult(-5));
        System.out.println(getResult(0));
    }

    private static double getResult(double x) {
        if (x <= -3) {
            return 9;
        } else if (x > 3) {
            return 1/(x * x +1);
        }
        return Double.NaN;
    }
}
