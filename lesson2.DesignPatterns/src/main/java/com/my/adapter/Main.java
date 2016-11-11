package com.my.adapter;

/**
 * Created by aleksandrpliskin on 10.11.16.
 */
public class Main {
  public static void main(String[] args) {
    Animal cat = new Cat();
    Man catAdapter = new CatAdapter(cat);

    catAdapter.talk();
    catAdapter.think();
    catAdapter.work();
  }
}
