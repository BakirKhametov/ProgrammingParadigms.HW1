package Declarative;

import java.util.Arrays;
import java.util.Comparator;

public class Declarative {
    public static void main(String[] args) {
        Integer[] arr = { 5, 3, 8, 12, 24, 0, 6, 8 };

        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
