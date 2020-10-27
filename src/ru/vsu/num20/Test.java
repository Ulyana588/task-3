package ru.vsu.num20;

public class Test {

    public static void testPoints(Picture picture) {
        Point[] pointsArr = {new Point(1, -0.5), new Point(0.5, -0.2), new Point(1, 2.6),
                new Point(6, -1), new Point(-0.5, 5)};

        SimpleColor[] resultsArray = {SimpleColor.YELLOW, SimpleColor.BLUE, SimpleColor.YELLOW,
                SimpleColor.ORANGE, SimpleColor.GRAY};

        for (int i = 0; i < pointsArr.length; i++) {
            SimpleColor pointColor = picture.getColor(pointsArr[i].getX(), pointsArr[i].getY());
            SimpleColor expectedColor = resultsArray[i];
            if(pointColor == expectedColor) System.out.println(pointColor + ": " + expectedColor + " - " + "true");
            else System.out.println(pointColor + ": " + expectedColor + " - " + "false");
        }
    }

}