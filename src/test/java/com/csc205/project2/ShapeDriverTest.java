package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeDriverTest {

    @Test
    public void testCube() {
        Cube cube = new Cube(2);

        assertEquals(8, cube.volume());
        assertEquals(24, cube.surfaceArea());
    }

    @Test
    public void testCone() {
        Cone cone = new Cone(6, 3);

        assertEquals(56.548667764616276, cone.volume());
        assertEquals(91.49766646167468, cone.surfaceArea());
    }

    @Test
    public void testCylinder() {
        Cylinder cylinder = new Cylinder(9, 2);

        assertEquals(113.09733552923255, cylinder.volume());
        assertEquals(138.23007675795088, cylinder.surfaceArea());
    }

    @Test
    public void testSphere() {
        Sphere sphere = new Sphere(8);

        assertEquals(2144.660584850632, sphere.volume());
        assertEquals(804.247719318987, sphere.surfaceArea());
    }
}