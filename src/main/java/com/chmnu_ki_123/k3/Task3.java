package com.chmnu_ki_123.k3;

public class Task3 {
    public static void main(String[] args) {
        int N = 5;
        int[][] array = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = i * N + j;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int num = array[i][j];
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            System.out.println("Мінімальний елемент: " + min);
            System.out.println("Максимальний елемент: " + max);
        }
    }
}