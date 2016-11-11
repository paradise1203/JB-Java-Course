package com.my.prototype;

import java.util.UUID;

/**
 * Created by aleksandrpliskin on 09.11.16.
 */
public class Mercedez implements Cloneable {

  private String model;
  private UUID uuid;

  public Mercedez(String model, UUID uuid) {
    this.model = model;
    this.uuid = uuid;
  }

  public Mercedez() {
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  @Override
  public Mercedez clone() throws CloneNotSupportedException {
    return (Mercedez) super.clone();
  }

  @Override
  public String toString() {
    return "Mercedez{" +
            "model='" + model + '\'' +
            ", uuid=" + uuid +
            '}';
  }
}
