package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import com.epam.javacourse.lessons1_2.Lesson2.Objects.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task7 {
    public static void main (String[] args) {
    /*TASK 7*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        System.out.println("Enter a, b");
        try {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            if (a > b) {
                System.out.println("Enter c");
                c = Integer.parseInt(br.readLine());
                System.out.println(Utils.getTotalSum(b, c));
            } else if ( a == b) {
                System.out.println("Конец");
            } else {
                System.out.println("Enter c");
                c = Integer.parseInt(br.readLine());
                System.out.println(Utils.getTotalSum(a, b, c));
                System.out.println("Новый год!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
