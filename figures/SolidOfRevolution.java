package com.figures.figures;

public class SolidOfRevolution extends Shape {
    private double radius = 1.7;
    public SolidOfRevolution (double radius){
        this.radius = radius;}

    public SolidOfRevolution() {
        System.out.println("Solid of revolution:" + printInfo1());
    }

    @Override
    public String shape(){
        super.shape();
        return null;
    }
    public String printInfo1() {
        System.out.println("Radius");
        return "{" +
                "radius=" + radius +
                '}';}
}
