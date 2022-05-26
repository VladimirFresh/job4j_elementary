package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        int[] temp = new int[count];
        int ind = 0;
        for (int[] row : array) {
            for (int cell : row) {
                temp[ind] = cell;
                ind++;
            }
        }
        int len = (int) Math.ceil(Math.sqrt(count));
        int[][] result = new int[len][len];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (index < count) {
                    result[i][j] = temp[index];
                            index++;
                } else {
                    result[i][j] = 0;
                    index++;
                }
            }
        }
        return result;
    }

}