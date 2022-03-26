package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 0, 3, 0);
        System.out.println("result (1, 0) to (3, 0) " + result);
        result = Point.distance(3, 0, 7, 0);
        System.out.println("result (3, 0) to (7, 0) " + result);
        result = Point.distance(0, 4, 0, 8);
        System.out.println("result (0, 4) to (0, 8) " + result);
    }
}
