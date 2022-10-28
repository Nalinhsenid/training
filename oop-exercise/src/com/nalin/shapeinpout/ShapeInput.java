package com.nalin.shapeinpout;

import com.nalin.interfaces.Shape;
import com.nalin.shapes.Circle;
import com.nalin.shapes.Rectangle;
import com.nalin.shapes.Square;

import java.util.Scanner;

public class ShapeInput {

    public Shape getInputShape(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the shape (1. Rectangle 2. Circle 3. Square)");
        System.out.print("Shape : ");
        int shape = input.nextInt();

        Shape shapeRef = null;
        if(shape == Shapes.RECTANGLE.shape){
            System.out.print("Height : ");
            double height = input.nextDouble();
            System.out.print("width : ");
            double width = input.nextDouble();
            shapeRef= new Rectangle(height,width);
        }else if(shape ==Shapes.CIRCLE.shape){
            System.out.print("radius : ");
            double radius = input.nextDouble();
            shapeRef = new Circle(radius);
        }else if(shape == Shapes.SQUARE.shape){
            System.out.print("Side length : ");
            double sideLength = input.nextDouble();
            shapeRef = new Square(sideLength);

        }else{
            System.out.print("Please Enter a valid input");
            System.exit(0);
        }
        return shapeRef;
    }

}
