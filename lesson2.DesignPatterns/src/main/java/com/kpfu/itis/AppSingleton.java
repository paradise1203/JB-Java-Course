package com.kpfu.itis;

/**
 * Created by aleksandrpliskin on 11.11.16.
 */
public class AppSingleton {

  private static Singleton singleton;

  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }

  private static class Singleton {

    Singleton() {

    }


  }

}
