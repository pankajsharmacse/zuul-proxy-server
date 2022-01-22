package com.webapi.springboot;

public class LogestPalindrom {
    //abccbccbb

    public static void main(String[] args)
    {
        LogestPalindrom logestPalindrom = new LogestPalindrom();
        logestPalindrom.logestPalindrom("abccbccbb");
    }

    public void logestPalindrom(String value)
    {
        int maxLength = 0;
        int length = 0;
        String maxString = null;
        for(int i = 0; i< value.length(); i++) {
            length = findPalindrom(value.substring(i));
            if(length > maxLength)
            {
                maxLength = length;
                maxString = value.substring(i);
            }
        }
        System.out.println("maxLength "+maxLength+" and maxString "+maxString);
    }
    
    public int findPalindrom(String value)
    {
        boolean isPalindrom = false;
        char[] array = value.toCharArray();
        for(int i=0; i < array.length-1; i++)
        {
//            System.out.println(array+" length"+ array.length);
            if(array[i]==array[array.length -1 -i])
            {
                isPalindrom = true;
            }
            else
            {
                isPalindrom = false;
                
            }
        }
        if(isPalindrom)
            return value.length();
        else
            return 0;
    }
}
