package com.kpfu.itis.singleton;

/**
 * @author Aidar Shaifutdinov.
 */
public class EarlyLoadingSingleton {

    private static final EarlyLoadingSingleton instance = new EarlyLoadingSingleton();

    private EarlyLoadingSingleton() {}

    public static EarlyLoadingSingleton getInstance() {
        return instance;
    }

}
