package com.webapi.springboot;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Even implements Runnable{

    Lock lock = null;

    public Even(Lock lock)
    {
        this.lock = lock;

    }

    @Override
    public void run() {

        while(true) {

            lock.lock();
            System.out.println("even");
            lock.unlock();


        }
        }
}
