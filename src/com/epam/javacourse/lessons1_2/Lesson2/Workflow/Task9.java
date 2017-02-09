package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import com.epam.javacourse.lessons1_2.Lesson2.Objects.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task9 {
 /*   Программа запрашивает количество чисел, затем вводит целые числа в соответствии
    с указанным количеством. Определяет количество четных, сумму кратных 3-м и
    количество чисел, модуль которых <3
    */
    public static void main (String[] args) {
    /*TASK 9*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count,num,countEven =0, multiple3Sum =0, countMod3 =0;
        System.out.println("Enter the count of numbers");
        try {
            count = Integer.parseInt(br.readLine());
            System.out.println("Enter integers");
            for (int i = 0; i < count; i++) {
                num = Integer.parseInt(br.readLine());
                if (num%2 == 0){
                    countEven++;
                }
                if (num%3 == 0) {
                    multiple3Sum += num;
                }
                if (Math.abs(num) < 3) {
                    countMod3++;
                }
            }
            System.out.println("Количество четных - " + countEven);
            System.out.println("Сумма кратных 3 - " + multiple3Sum);
            System.out.println("Количество чисел, модуль которых Б 3 - " + countMod3);
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
