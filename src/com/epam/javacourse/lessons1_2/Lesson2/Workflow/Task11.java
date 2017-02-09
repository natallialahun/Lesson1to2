package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task11 {
   /* Программа запрашивает количество чисел, вводит целые числа в соответствии с
    заявленным количеством ,определяет, сколько чисел больше 15 или <2, чему равна
    сумма чисел, которые делятся на 5 с остатком 4. Результат вывести на экран.
*/
    public static void main (String[] args) {
    /*TASK 11*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count,num, countMore15Less2 = 0,sumDiv5Res4 =0;

        System.out.println("Enter the count of numbers");
        try {
            count = Integer.parseInt(br.readLine());
            System.out.println("Enter integers");
            for (int i = 0; i < count; i++) {
                num = (int) Integer.parseInt(br.readLine());
                if (num >15 || num < 2){
                    countMore15Less2++;
                }
                if (num%5 == 4) {
                    sumDiv5Res4 += num;
                }
            }
            System.out.println("Количество чисел > 15 или < 2 - " + countMore15Less2);
            System.out.println("Сумма чисел, которые делятся на 5 с остатком 4 - " + sumDiv5Res4);
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
