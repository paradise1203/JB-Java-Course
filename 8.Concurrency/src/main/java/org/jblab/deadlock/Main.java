package org.jblab.deadlock;

/**
 * @author Aidar Shaifutdinov.
 */
public class Main {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                synchronized (lock1) {
                    synchronized (lock2) {
                        System.out.println("Thread 1");
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (lock1) {
                    synchronized (lock2) {
                        System.out.println("Thread 2");
                    }
                }
            }
        }).start();
    }
}
