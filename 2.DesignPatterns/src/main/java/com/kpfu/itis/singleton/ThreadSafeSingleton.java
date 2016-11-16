package com.kpfu.itis.singleton;

/**
 * @author Aidar Shaifutdinov.
 */
public class ThreadSafeSingleton {

    private volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
