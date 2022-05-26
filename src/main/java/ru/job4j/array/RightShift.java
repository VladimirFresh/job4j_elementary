package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
            int[] newArray = new int[nums.length];
            System.arraycopy(nums, 0, newArray, 0, nums.length);
            System.arraycopy(newArray, 0, nums, count, nums.length - count);
            System.arraycopy(newArray, nums.length - count, nums, 0, count);
    }

    private static void shift(int[] nums) {
        int[] newArray = new int[nums.length];
        System.arraycopy(nums, 0, newArray, 0, nums.length);
        System.arraycopy(newArray, 0, nums, 1, nums.length - 1);
        System.arraycopy(newArray, nums.length - 1, nums, 0, 1);
    }
}
