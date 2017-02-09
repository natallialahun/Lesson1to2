package com.epam.javacourse.lessons1_2.Lesson2.Objects;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Utils {

    public static int getTotalSum (int... numbers) {
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        return sum;
    }

    public static double calcFormula (int a, int b, int c) {
        return a*a - Math.pow(b-c, 2) + Math.log(b * b + 1);
    }



}

