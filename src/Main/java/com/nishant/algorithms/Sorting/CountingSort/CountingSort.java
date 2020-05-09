package com.nishant.algorithms.Sorting.CountingSort;

public class CountingSort {

    public static void sort(int[] arr) {
        int[] minMax = minAndMax(arr);
        int[] count = new int[minMax[1] - minMax[0] + 1];

        for(int i = 0; i < arr.length; i ++) {
            count[arr[i] - minMax[0]] ++;
        }

        int k = 0;
        for(int i = 0; i < count.length; i ++) {
            while(count[i] > 0) {
                arr[k ++] = i + minMax[0];
                count[i] --;
            }
        }
    }

    private static int[] minAndMax(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }

}
