package org.example;

import java.util.Arrays;

import static org.example.ArraySort.mergeAndSort;

public class Main {
    public static void main(String[] args) {
        Integer[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        Integer[] Y = {1, 8, 9, 10, 15};
        mergeAndSort(X, Y);

        System.out.println("New array " + Arrays.toString(X));

    }
}