package org.example;

import java.util.Arrays;

public class ArraySort {


    public static void mergeAndSort(Integer[] X, Integer[] Y) {
        int m = X.length;
        int n = Y.length;
        int j = 0;

        for (int i = 0; i < m; i++) {
            if (X[i] == 0 && j < n) {
                X[i] = Y[j++];
            }
        }

        bubbleSort(X);
    }

    public static void bubbleSort(Integer[] arr) {
        boolean flag;
        int temp;

        do {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) { // {1, 2, 3}
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        } while (flag);
    }

}
