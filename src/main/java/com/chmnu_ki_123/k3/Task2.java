package com.chmnu_ki_123.k3;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = {3, -5, 6, -2, 0, -9, 4};

        int negativeCount = 0;

        for (int num : numbers) {
            if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Кількість від'ємних чисел: " + negativeCount);
    }
}

