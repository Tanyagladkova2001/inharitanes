package com.figures.figures;

public class Shape {
    public static void main(String[] args) {
        Shape shape = new Shape(1.5);
        Pyramid pyramid = new Pyramid(2.0, 2.5);
        Cylinder cylinder = new Cylinder(3.0);
        Ball ball = new Ball();
        SolidOfRevolution solidOfRevolution = new SolidOfRevolution(1.7);

        shape.shape();
        pyramid.shape();
        cylinder.shape();
        solidOfRevolution.shape();
        ball.shape();

    }
    private double volume = 1.5;

    @Override
    public String toString() {
        return "Ball{" +
                "ball=" + volume +
                "} " + super.toString();
    }

    public Shape(double volume) {
        this.volume = volume;
    }

    public Shape() {
    }

    public double getRadius(double radius) {
        return radius;
    }

    public double getVolume(double volume) {
        return volume;
    }
    public String shape() {
        return null;
    }
}