package com.my.adapter;

/**
 * Created by aleksandrpliskin on 10.11.16.
 */
public class Cat implements Animal {
  @Override
  public void makeSounds() {
    System.out.println("mauu");
  }

  @Override
  public void run() {
    System.out.println("_____ _____ ____");
  }

  @Override
  public void eat() {
    System.out.println("mauu ___-___");
  }
}
