package com.kpfu.itis.prototype;

import java.util.UUID;

/**
 * Created by aleksandrpliskin on 09.11.16.
 */
public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Mercedez mercedez = new Mercedez();
    mercedez.setModel("Benz");
    mercedez.setUuid(UUID.randomUUID());

  }
}
