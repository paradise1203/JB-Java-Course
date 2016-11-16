package com.kpfu.itis.singleton;

/**
 * @author Aidar Shaifutdinov.
 */
public enum EnumSingleton {
    INSTANCE("id");

    private String id;

    EnumSingleton(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
