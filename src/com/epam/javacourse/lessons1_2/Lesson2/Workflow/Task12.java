package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task12 {
    /* Создать программу ввода целых чисел как аргументов командной строки, подсчета
их суммы и вывода результата на консоль.
*/
    public static void main (String[] args) {
        /*TASK 12*/
        int sum = 0;

        for (String arg: args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }
        }
        System.out.println(sum);

    }
}
