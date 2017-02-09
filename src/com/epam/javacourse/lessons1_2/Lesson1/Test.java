package com.epam.javacourse.lessons1_2.Lesson1;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Test {

    public static void main (String[] args){
        Circle circle = new Circle(5);
        System.out.println("Circuit = "+ circle.getCircuit()+ ", Square = "+ circle.getSquare());
        Integer num = 123456;
        System.out.println("The product of numbers of "+ num + " = "+ Utils.getProductOfNumbers( num));
    }
}
