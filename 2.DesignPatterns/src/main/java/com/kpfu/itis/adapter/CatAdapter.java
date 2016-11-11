package com.kpfu.itis.adapter;

/**
 * Created by aleksandrpliskin on 10.11.16.
 */
public class CatAdapter implements Man {

  private Animal animal;

  public CatAdapter(Animal animal) {
    this.animal = animal;
  }

  @Override
  public void talk() {
    animal.makeSounds();
  }

  @Override
  public void think() {
    animal.eat();
  }

  @Override
  public void work() {
    animal.run();
  }
}
