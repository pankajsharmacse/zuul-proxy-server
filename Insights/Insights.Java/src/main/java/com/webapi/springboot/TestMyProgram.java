package com.webapi.springboot;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestMyProgram {

    // 2,4, 6
    // 1,3,5
    // 1,2 3 ,4

    //abccb



    public static void main(String[] args)
    {
        int limit = 10;
        int i = 0;
        Lock lock = new ReentrantLock();


        Thread thread1 = new Thread(new Odd(lock));

        Thread thread2 = new Thread(new Even(lock));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}