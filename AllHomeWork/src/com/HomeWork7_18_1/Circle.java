package com.HomeWork7_18_1;

public class Circle implements ShapeArea{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "圆的半径是"+this.radius+"\t圆的周长是"+getPerimeter()+"\t圆的面积是"+getArea();
    }
}
