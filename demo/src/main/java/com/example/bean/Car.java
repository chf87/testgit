package com.example.bean;

/**
 * Created by zf-42 on 2017/4/9.
 */

public class Car {

    private int id;

    private int color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
