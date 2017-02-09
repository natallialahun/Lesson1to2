package com.epam.javacourse.lessons1_2.Lesson2.Workflow;



/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task13_14 {
    /*
    * Даны три действительных числа. Возвести в квадрат те из них, значения которых
неотрицательны, и в четвертую степень — отрицательные.*/
    public static void main(String[] args) {
        /*TASK 13*/
        System.out.println("Formula1 = " + calcFormulaTask13a(1,2,3));
        System.out.println("Formula2 = " + calcFormulaTask13b(1,2,3, 1.3));

        /*TASK 14*/
        int[] arr = {1, -2, 3};
        for (int num: arr) {
            System.out.println(calcFormulaTask14(num));
        }
    }

    private static double calcFormulaTask14 (double a) {
        if (a >= 0) {
            return Math.pow(a, 2);
        } else {
            return Math.pow(a, 4);
        }
    }

    private static double calcFormulaTask13a(double a, double b, double c) {
        return ((b + Math.sqrt(b * b * 4 * a * c))/2*a) - Math.pow(a, 3)* c + b;
    }

    private static double calcFormulaTask13b(double a, double b, double c, double d) {
        return (a/c) * (b/d) - (a*b -c)/c*d;
    }
}
