package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

public class ShapeDriver {

    public static void main(String[] args) {

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape cone = new Cone(5.0, 2.0);
        return new Runnable() {}

        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);
        shapes.forEach(System.out::println);
    }

}
