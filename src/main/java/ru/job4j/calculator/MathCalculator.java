package ru.job4j.calculator;

import static ru.job4j.calculator.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double totalSum(double first, double second) {
        return sumAndMultiply(first, second) + subtractionAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + totalSum(10, 20));
    }
}
