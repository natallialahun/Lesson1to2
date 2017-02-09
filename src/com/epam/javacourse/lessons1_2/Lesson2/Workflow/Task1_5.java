package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import com.epam.javacourse.lessons1_2.Lesson2.Objects.RightTriangle;
import com.epam.javacourse.lessons1_2.Lesson2.Objects.Utils;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task1_5 {

    public static void main (String[] args) {

        /*TASK 2*/
        System.out.println("Full name: Natallia Lahun");

        /*TASK 3*/
        System.out.println("Пройдет много лет, и полковник Аурелиано Буэндиа, стоя у стены в ожидании расстрела,\n" +
                "вспомнит тот далекий вечер, когда отец взял его с собой посмотреть на лед. Макондо было\n" +
                "тогда небольшим селением с двумя десятками хижин, выстроенных из глины и бамбука на\n" +
                "берегу реки, которая мчала свои прозрачные воды …");

        /*TASK 4*/
        RightTriangle triangle = new RightTriangle(3,5);
        System.out.println("Hypotenuse = " + triangle.getHypotenuse()+ ", Square = " + triangle.getSquare());

        /*TASK 5*/
        System.out.println("The sum is " + Utils.getTotalSum(1,2,3,4,5,6,7,8,20));
   }

}
