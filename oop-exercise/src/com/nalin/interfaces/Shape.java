package com.nalin.interfaces;

import java.util.HashMap;

public interface Shape {
    public String getShape();

    public HashMap<String, Double> getProperties();

    public double getArea();
    public double getPerimeter();
}
