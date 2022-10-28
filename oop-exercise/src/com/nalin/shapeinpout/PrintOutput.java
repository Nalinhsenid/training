package com.nalin.shapeinpout;

import com.nalin.interfaces.Shape;

import java.util.Map;


public class PrintOutput {
    public static void printOutputShape(Shape shape) {
        System.out.println("\nOutput: ");
        System.out.println("Shape : " +shape.getShape());

        //print properties
        System.out.println("\nProperties: ");
        for (Map.Entry<String,Double> property :shape.getProperties().entrySet()){
            System.out.println(property.getKey() +" = "+property.getValue());
        }

        System.out.println("Area : " + shape.getArea());
        System.out.println("Perimeter : " + shape.getPerimeter());
    }
}
