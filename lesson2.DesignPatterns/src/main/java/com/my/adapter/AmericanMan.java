package com.my.adapter;

/**
 * Created by aleksandrpliskin on 10.11.16.
 */
public class AmericanMan implements Man {
  @Override
  public void talk() {
    System.out.println("I am American");
  }

  @Override
  public void think() {
    System.out.println("Trump");
  }

  @Override
  public void work() {
    System.out.println("I like my job");
  }
}
