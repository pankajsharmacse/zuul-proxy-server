package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

public class StringFinder {

    static String rearrageChar(String value)
    {
        boolean possible = false;
        char[] arr = value.toCharArray();
        Arrays.sort(arr);

        for(int i= 0, j = arr.length -1; i < arr.length -1; i++, j--)
        {
            if(arr[i] == arr[j])
            {
                possible = false;
            }
            if(arr[i] == arr[i+1])
            {
                char temp = arr[i+1];
                arr[i+1] = arr[j];
                arr[j] = temp;
                i++;
                possible = true;
            }

        }
        System.out.println(possible);
        return new String(arr);
    }

    public static void main(String[] args)
    {
//        System.out.println(rearrageChar("aaaabc"));
        System.out.println(findString("a+b+c","abc"));
    }

    private static boolean findString(String pattern, String value) {
        boolean possible = false;
        for(int i = 0; i < pattern.length()-1; i++)
        {
            char plus = pattern.charAt(i);
            boolean cancontinue = false;
            if(plus == '+')
            {
                cancontinue = true;
            }
            for(int j =0; j < value.length()-1; j++)
            {
                if(pattern.charAt(i)==value.charAt(j) || cancontinue)
                {
                    possible = true;
                }
                else{
                    break;
                }
            }
        }
        return possible;
    }

    volatile int counter;


}
