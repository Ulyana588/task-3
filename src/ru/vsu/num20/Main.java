package ru.vsu.num20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Line(3,1,0.6), new Line(-1,-4,0.6),
                new Parabola(-1,4,0.125), new Parabola(-3,2,0.5), new Parabola(-5,-6,0.5));
        Test.testPoints(picture);
        Point point = readPoint();
        printColor(point, picture);
    }
    private static Point readPoint(){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        return new Point(x, y);
    }
    private static void printColor(Point point, Picture picture){
        System.out.println(picture.getColor(point.getX(), point.getY()));
    }
}
