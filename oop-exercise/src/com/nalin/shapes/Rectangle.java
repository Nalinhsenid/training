package com.nalin.shapes;

import com.nalin.interfaces.Shape;

import java.util.HashMap;

public class Rectangle implements Shape {
    private double height;
    private double width;
    private HashMap<String,Double> shapeProperties = new HashMap<>();

    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
        shapeProperties.put("Height", height);
        shapeProperties.put("Width", width);
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public HashMap<String, Double> getProperties() {
        return shapeProperties;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return 2*height*width;
    }

}
