package com.chmnu_ki_123.k3;

import java.util.Arrays;

public class Task1 {

    public static double[] mergeSortedArrays(double[] array1, double[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        double[] resultArray = new double[length1 + length2];

        int i = 0, j = 0, k = 0;

        while (i < length1 && j < length2) {
            if (array1[i] < array2[j]) {
                resultArray[k++] = array1[i++];
            } else {
                resultArray[k++] = array2[j++];
            }
        }

        while (i < length1) {
            resultArray[k++] = array1[i++];
        }

        while (j < length2) {
            resultArray[k++] = array2[j++];
        }

        return resultArray;
    }

    public static void main(String[] args) {

        double[] array1 = {5.1, 2.4, 8.7, 9.4, 7.6};
        double[] array2 = {1.1, 10.2, 20.3, 65.4, 99.6};

        Arrays.sort(array1);
        Arrays.sort(array2);

        double[] resultArray = mergeSortedArrays(array1, array2);

        System.out.println("Merged and Sorted Array: " + Arrays.toString(resultArray));
    }
}

