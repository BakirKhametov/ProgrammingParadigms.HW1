package Imperative;

import java.util.Arrays;

public class Imperative {
    public static void main(String[] args) {
        Integer[] arr = { 5, 3, 8, 12, 24, 0, 6, 8 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] < arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}

/*
 * public static void sort(int[] array) {
 * for (int i = 0; i < array.length - 1; i++) {
 * for (int j = array.length - 1; j > i; j--) {
 * if (array[j - 1] > array[j]) {
 * int tmp = array[j - 1];
 * array[j - 1] = array[j];
 * array[j] = tmp;
 * }
 * }
 * }
 * 
 * }
 * }
 */