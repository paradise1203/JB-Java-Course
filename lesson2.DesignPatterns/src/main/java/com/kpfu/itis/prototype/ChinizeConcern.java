package com.kpfu.itis.prototype;

/**
 * Created by aleksandrpliskin on 09.11.16.
 */
public class ChinizeConcern {

  private Mercedez ideal;

  public ChinizeConcern(Mercedez ideal) {
    this.ideal = ideal;
  }

  public Mercedez make() throws CloneNotSupportedException {
    return this.ideal.clone();
  }

}
