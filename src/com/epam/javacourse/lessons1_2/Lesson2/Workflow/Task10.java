package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task10 {
    /*
    Программа вводит количество чисел N, а затем N вещественных чисел. Программа
    усекает вещественные числа и определяет, сколько среди усеченных чисел четных
    и >15
    */
    public static void main (String[] args) {
    /*TASK 10*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count,num, countEven = 0,count15 =0;

        System.out.println("Enter the count of numbers");
        try {
            count = Integer.parseInt(br.readLine());
            System.out.println("Enter floats");
            for (int i = 0; i < count; i++) {
                num = (int) Double.parseDouble(br.readLine());
                if (num % 2 == 0){
                    countEven++;
                }
                if (num>15) {
                    count15++;
                }
            }
            System.out.println("Количество четных - " + countEven);
            System.out.println("Количество больше 15 - " + count15);
        } catch (NumberFormatException e) {
            System.out.println("Not a double number!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
