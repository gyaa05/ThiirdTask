package ru.vsu.cs.vvp2022.guzenko_ya_a;

import java.util.Scanner;

public class Main {
    public static final Line L1 = new Line(0, -1, 0);
    public static final Line L2 = new Line(1, 0, 0.5);
    public static final Line L3 = new Line(0, -1, 2.5);
    public static final Circle C1 = new Circle(-3, 4, 5);

    public static SimpleColor getColor(double x, double y) {
        if (!L1.isPointAboveLine(x, y)) {
            if (L2.isPointAboveLine(x, y)) {
                return SimpleColor.YELLOW;
            } else {
                if (L3.isPointAboveLine(x, y)) {
                    return SimpleColor.ORANGE;
                } else {
                    return SimpleColor.GRAY;
                }
            }
        } else {
            if (!L3.isPointAboveLine(x, y)) {
                if (C1.isPointInCircle(x, y)) {
                    return SimpleColor.BLUE;
                } else {
                    return SimpleColor.GREEN;
                }
            } else {
                if (!L2.isPointAboveLine(x, y)) {
                    return SimpleColor.BLUE;
                } else {
                    if (y < C1.y0) {
                        return SimpleColor.ORANGE;
                    } else {
                        return SimpleColor.YELLOW;
                    }
                }
            }
        }
    }

    public static double getValue(String valName) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите значение %s = ", valName);
        double value = scanner.nextDouble();

        return value;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("Цвет введенной точки %s", getColor(x, y));
    }

    public static void main(String[] args) {
        double x = getValue("x");
        double y = getValue("y");

        printColorForPoint(x, y);
    }
}
