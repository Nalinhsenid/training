package com.nalin.shapes;

import com.nalin.interfaces.Shape;

import java.util.HashMap;

public class Circle implements Shape {
    private double radius;

    private HashMap<String,Double> shapeProperties = new HashMap<>();
    public Circle(double radius){
        this.radius = radius;
        shapeProperties.put("Radius",radius);
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public HashMap<String, Double> getProperties() {
        return shapeProperties;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI * radius;
    }


}
