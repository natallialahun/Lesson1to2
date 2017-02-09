package com.epam.javacourse.lessons1_2.Lesson2.Workflow;

import com.epam.javacourse.lessons1_2.Lesson1.Objects.Circle;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Task16 {
    public static void main(String[] args){
        Circle circle = new Circle(40);

        System.out.println("Длина окружности = " + circle.getCircuit()+ ", площадь круга = " + circle.getSquare());
    }
}
