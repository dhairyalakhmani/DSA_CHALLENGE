package DSA_CHALLENGE.Sorting;

public class selectionSort {
    public static void SS(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int last = n - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    public static void swap(int[] arr , int max , int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SS(arr);
        for(int i : arr)
            System.out.print(i + " ");
    }
}
