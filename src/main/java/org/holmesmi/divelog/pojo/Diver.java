package org.holmesmi.divelog.pojo;

import javax.persistence.Entity;

@Entity
public class Diver {
    private String name;
    private int lifetimeDives;

    public Diver(String name) {
        this.name = name;
    }

    public int getLifetimeDives() {
        return lifetimeDives;
    }

    public void setLifetimeDives(int lifetimeDives) {
        this.lifetimeDives = lifetimeDives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
