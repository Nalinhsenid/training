package com.nalin.shapeinpout;

public enum Shapes {
    RECTANGLE(1),
    CIRCLE(2),
    SQUARE(3);
    public final int shape;

    private Shapes(int shape) {
        this.shape = shape;
    }
}
