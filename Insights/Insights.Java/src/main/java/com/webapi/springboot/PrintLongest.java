package com.webapi.springboot;

import java.util.Arrays;

public class PrintLongest {


    public static void main(String args[])
    {
        int[] array = {2,5,3,6,9,12,15,34,23};

        System.out.println(printLogestArithmeticArray(array));
    }
    public static int printLogestArithmeticArray(int[] array)
    {
        int count= 1;
        int maxCount = 0;
        int difference = 0;

        for(int i = 0; i < array.length -1; i++)
        {

            System.out.println("difference "+difference);
            if(difference == 0)
                difference = array[i+1]-array[i];  // 5-3

            System.out.println("First Element "+array[i]);
            System.out.println("Next Element "+array[i+1]);
            if(array[i+1]-array[i] == difference)  // 1
            {
                count++;

                if(count > maxCount)
                {

                    maxCount = count;
                }
            }
            else
            {
                count = 1;
                difference = 0;
                i = i-1;
            }

        }
        return maxCount;
    }
}
