package com.moskvin;

import com.moskvin.algorithms.Algorithm;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 8, 124, 244, 82, 2, 4, 99};
//        int[] arrM1 = {1, 3, 12, 53, 8239};
//        int[] arrM2 = {2, 4, 8, 16, 44, 45, 46, 47, 123};
        int[] array2;

//        array2 = Algorithm.selectionSort(array);

//        array2 = Algorithm.insertionSort(array);

        array2 = Algorithm.bubbleSort(array);

//        Algorithm.merge(array, 0, 4, array.length);

//        array2 = Algorithm.mergeSort(array);

//        array2 = Algorithm.merge(arrM1, arrM2);
    }
}
