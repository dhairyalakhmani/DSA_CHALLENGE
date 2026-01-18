package DSA_CHALLENGE.Sorting;

import java.util.Arrays;

public class mergeSort {
    public static int[] sort(int[] arr) {
        if (arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] a, int[] b) {
        int[] finalArr = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                finalArr[k] = a[i];
                i++;
            } else {
                finalArr[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            finalArr[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            finalArr[k] = b[j];
            j++;
            k++;
        }
        return finalArr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 64, 3, 73, 7, 783, 7, 3, 7, 3, 43, 2, 62, 11, 356, 4, 734, 26, 2, 5};
        arr = sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
