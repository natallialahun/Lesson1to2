package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import com.epam.javacourse.lessons1_2.Lesson2.Objects.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task8 {
    /*
    * Программа вводит два числа a и b, если a=b, то вывести на экран слова «скоро Новый
Год!», в противном случае ввести третье число с и вывести на экран 3 строки :
-значение выражения a+b+c
-значение выражения 𝑎2 + 𝑏2
-«моя любимая футбольная команда»*/
    public static void main (String[] args) {
    /*TASK 8*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        System.out.println("Enter a, b");
        try {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            if ( a == b) {
                System.out.println("скоро Новый Год!");
            } else {
                System.out.println("Enter c");
                c = Integer.parseInt(br.readLine());
                System.out.println("a + b + c = "+ Utils.getTotalSum(a, b, c));
                System.out.println(a * a + b * b);
                System.out.println("моя любимая футбольная команда");
            }
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
