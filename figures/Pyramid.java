package com.figures.figures;

public class Pyramid extends Shape {
    private static double s = 2.0;
    private static double h = 2.5;

    public String shape(){
        System.out.println("Pyramid:" + printInfo() + "" + printInfo1());
        super.shape();
        return null;
    }
    public String printInfo() {
        return "{" +
                "s =" + s +
                ',';
    }
    public String printInfo1() {
        return "" +
                "h =" + h +
                '}';}

        public Pyramid (double s, double h){
        Pyramid.s = s;
        Pyramid.h = h;
    }
}
