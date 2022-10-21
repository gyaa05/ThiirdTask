package ru.vsu.cs.vvp2022.guzenko_ya_a;

public class Circle {
    public double x0;
    public double y0;
    public double r;

    public Circle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }

    public boolean isPointInCircle(double x, double y) {
        return Math.sqrt((x - x0) * (x - x0) + (y - y0) * (y - y0)) < r;
    }
}
