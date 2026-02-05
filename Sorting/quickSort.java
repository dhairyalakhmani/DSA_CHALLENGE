package DSA_CHALLENGE.Sorting;

import java.util.Arrays;

public class quickSort {
    public static void sort(int[] arr) {
        sorter(arr , 0 , arr.length - 1);
    }

    public static void sorter(int[] arr, int low, int high) {
        if (low > high)
            return;
        int s = low;
        int e = high;
        int m = (s + e) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot)
                s++;
            while (arr[e] > pivot)
                e--;

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sorter(arr , low , e);
        sorter(arr , s , high);
    }

    public static void main(String[] args) {
        int[] arr = {3 , 2 , 6 , 1 , 5 , 7 , 8 , 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
