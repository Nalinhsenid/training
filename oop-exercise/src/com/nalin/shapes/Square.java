package com.nalin.shapes;

import com.nalin.interfaces.Shape;

import java.util.HashMap;

public class Square implements Shape {
    private double sideLength;
    private HashMap<String,Double> shapeProperties = new HashMap<>();

    public Square(double sideLength){
        this.sideLength = sideLength;
        shapeProperties.put("Side Length", sideLength);
    }

    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public HashMap<String, Double> getProperties() {
        return shapeProperties;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return sideLength*sideLength;
    }

    @Override
    public double getPerimeter() {
        return sideLength*4;
    }

}
