package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int result = 0;
        int standart = 8;
        for (int i = 0; i < hours.length - 2; i++) {
            if (hours[i] <= 8) {
                result = hours[i] * 10 + result;
            } else {
                result = standart * 10 + (hours[i] - 8) * 15 + result;
            }
        }
        for (int i = 5; i < hours.length; i++) {
            if (hours[i] <= 8) {
                result = hours[i] * 20 + result;
            } else {
                result = standart * 20 + ((hours[i] - 8) * 30) + result;
            }
        }
        return result;
    }
}