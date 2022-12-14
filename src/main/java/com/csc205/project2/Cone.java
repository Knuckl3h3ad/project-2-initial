package com.csc205.project2;

public class Cone extends Shape{

    private double radius;
    private double height;

    public Cone() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double height, double radius) {
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
        return ((Math.PI * radius)*(radius + (Math.sqrt((height * height)+(radius * radius)))));
    }
    public double volume() {
        return Math.PI * radius * radius * (height / 3.0);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
