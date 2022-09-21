package com.csc205.project2;

public class Cylinder extends Shape{

    private double radius;
    private double height;

    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double height, double radius) {
        super();
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {return height;}
    public double getRadius() {return radius;}

    public void setHeight(double height) {
        this.height = height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return ((2.0 * Math.PI * radius * height) + (2.0 * Math.PI * (radius * radius)));
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
