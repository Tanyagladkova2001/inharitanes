package com.figures.figures;

public class Cylinder extends SolidOfRevolution {
    private double height = 3.0;

    @Override
    public String shape() {
        System.out.println("Cylinder:" + printInfo());
        super.shape();
        return null;
    }

        public String printInfo() {
            return "{" +
                    "radius=" + height +
                    '}';}
    public String printInfo1() {
        return "{" +
                "height=" + height +
                '}';}


    public Cylinder(double height) {
        super(height);
    }
}
