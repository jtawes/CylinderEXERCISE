package com.example.java;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if(radius < 0 ) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }

    }


}

