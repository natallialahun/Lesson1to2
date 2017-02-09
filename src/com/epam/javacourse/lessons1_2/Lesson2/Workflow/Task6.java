package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import com.epam.javacourse.lessons1_2.Lesson2.Objects.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task6 {

    public static void main (String[] args) {
        /*TASK 6*/
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a, b, c");
        try {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            c = Integer.parseInt(br.readLine());
            System.out.println(Utils.calcFormula(a, b, c));
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
