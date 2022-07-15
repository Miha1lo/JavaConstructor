package ua.ithillel.java;

import java.util.Objects;

/**
 * This class create attributes of Circle and count length and square of Circle
 * radius - radius of circle in cm
 * * author Mikhailo Tyurin
 */

public class Circle {

    private int radius;
    private double length;
    private double square;
    private String color;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
        this.square = Math.PI * radius;
        this.length = 2 * Math.PI * radius;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        this.square = Math.PI * radius;
        this.length = 2 * Math.PI * radius;
    }

    public void printInfoCircle() {
        System.out.println("\t-площадь = " + this.square);
        System.out.println("\t-длина = " + this.length);

        while (color != null) {
            System.out.println("\t-цвет = " + this.color);
            break;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
