package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread());

        thread.start();

        thread.join();
    }
}
class MyThread implements Runnable{
    volatile boolean flag = true;
    static ReentrantLock lock = new ReentrantLock();
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    @Override
    public void run() {
        executorService.submit(()->{
            while (true) {
                if (flag && lock.tryLock()) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Hi");
                    }
                    flag = false;
                    lock.unlock();
                }
            }
        });
        executorService.submit(()->{
            while (true) {
                if (!flag && lock.tryLock()) {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Bye");
                    }
                    flag = true;
                    lock.unlock();
                }
            }
        });
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}