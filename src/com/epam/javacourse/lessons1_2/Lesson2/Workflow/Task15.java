package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task15 {
    /*
    * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
шагом h. Результат представить в виде таблицы, первый столбец которой – значения
аргумента, второй - соответствующие значения функции:
*/
    public static void main (String[] args) {
        double a=0, b=15, h = 0.5, i;
        System.out.println("x\tF(x)");
        for (i=a; i<=b; i=i+h ) {
            System.out.println(i+"\t"+ getResult(i));
        }

    }

    private static double getResult(double x) {
        return 2* Math.tan(x/2) +1;
    }
}
