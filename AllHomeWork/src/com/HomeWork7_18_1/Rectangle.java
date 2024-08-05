package com.HomeWork7_18_1;

public class Rectangle implements ShapeArea{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.length+this.width);
    }

    @Override
    public String toString() {
        return "矩形的长为"+this.length+"\t矩形的宽为"+this.width+"\t矩形的周长为"
                +getPerimeter()+"\t矩形的面积为"+getArea();
    }
}
