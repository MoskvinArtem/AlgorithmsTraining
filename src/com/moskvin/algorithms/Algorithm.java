package com.moskvin.algorithms;

import java.sql.Array;

public final class Algorithm {

    // O(n^2)
    public static int[] selectionSort(int[] arr) {
        int[] result = arr.clone();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int smallerIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (result[j] < result[smallerIndex]) {
                    smallerIndex = j;
                }
            }
            int smallerNumber = result[smallerIndex];
            result[smallerIndex] = result[i];
            result[i] = smallerNumber;
        }
        return result;
    }

    // O(n^2)
    public static int[] insertionSort(int[] arr) {
        int[] result = arr.clone();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = result[i];
            int j = i - 1;

            while (j >= 0 && current < result[j]) {
                result[j + 1] = result[j];
                j--;
            }
            result[j + 1] = current;
        }

        return result;
    }

    // O(n^2)
    public static int[] bubbleSort (int[] arr) {
        int[] result = arr.clone();
        int n = arr.length;
        int temp;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (result[j] > result[j + 1]) {
                    temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }

    public static int[] mergeSort (int[] arr) {
        int[] result = arr.clone();
        int right = arr.length - 1;
        int left = 0;

        msort(result, left, right);

        return result;
    }

    private static void msort (int[] arr, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;

        msort(arr, left, mid);
        msort(arr, mid + 1, right);
        mergeS(arr, left, mid, right);
    }

    private static void mergeS (int[] arr, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        for (int i = 0; i < lengthLeft; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < lengthRight; i++) {
            rightArray[i] = arr[mid + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < lengthLeft) {
                arr[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < lengthRight) {
                arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static int[] merge (int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int nr = n1 + n2;

        int[] result = new int[n1 + n2];

        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < nr; i++) {
            if (i1 < n1 && i2 < n2) {
                if (arr1[i1] < arr2[i2]) {
                    result[i] = arr1[i1];
                    i1++;
                } else {
                    result[i] = arr2[i2];
                    i2++;
                }
            } else if (i1 < n1) {
                result[i] = arr1[i1];
                i1++;
            } else if (i2 < n2) {
                result[i] = arr2[i2];
                i2++;
            }
        }
        return result;
    }
}
