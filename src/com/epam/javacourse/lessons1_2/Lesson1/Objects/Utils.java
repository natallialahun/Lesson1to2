package com.epam.javacourse.lessons1_2.Lesson1.Objects;

/**
 * Created by Natallia_Lahun on 02/09/2017.
 */
public class Utils {

    public static Integer getProductOfNumbers(Integer num) {
        int product = num%10;
        while ((num = num/10) >10) {
            product*= num%10;
        }
        return product;
    }
}
