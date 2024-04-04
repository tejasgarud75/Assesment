package org.example;

import java.util.Arrays;

import static org.example.ArraySort.mergeAndSort;
import static org.example.CountWords.countWords;
import static org.example.DuplicateWord.findDuplicateCharacters;
import static org.example.MaximumNumber.findMaximumSumPath;

public class Main {
    public static void main(String[] args) {
        //Question 1
        Integer[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        Integer[] Y = {1, 8, 9, 10, 15};
        mergeAndSort(X, Y);
        System.out.println("New array " + Arrays.toString(X));
        System.out.println();

        //Question 2
        int[] A = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] B = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        MaximumNumber.Result result = findMaximumSumPath(A, B);
        System.out.println("Maximum sum: " + result.sum);
        System.out.println("Maximum sum path: " + result.path);
        System.out.println();

        //Question 3
        String str = "Hello World, this is a sample string to count the number of words.";
        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
        System.out.println();

        //Question 4
        String string = "Hello World";
        findDuplicateCharacters(string);

    }
}