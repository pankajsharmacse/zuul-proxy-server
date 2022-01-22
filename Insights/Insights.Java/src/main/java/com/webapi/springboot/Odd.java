package com.webapi.springboot;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Odd implements Runnable {

    Lock lock = null;

    public Odd(Lock lock)
    {
        this.lock = lock;
    }

    @Override
    public void run() {
        while(true) {
            lock.lock();
            System.out.println("odd");
            lock.unlock();

        }
    }
}
