package ru.vsu.num20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Line(3, 1, 0.6), new Line(-1, -4, 0.6),
                new Parabola(-1, 4, 0.125), new Parabola(-3, 2, 0.5), new Parabola(-5, -6, 0.5));
        boolean indicator = Test.testPoints(picture);
        Point point = readPoint();
        printColor(picture, point, indicator);
    }

    private static void printColor(Picture picture, Point point, boolean indicator) {
        if (indicator) {
            System.out.println("(" + point.getX() + "; " + point.getY() + ")" + " Color is: " + picture.getColor(point.getX(), point.getY()));
        } else System.out.println("The program does not work correctly");
    }

    private static Point readPoint() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        return new Point(x, y);
    }
}
