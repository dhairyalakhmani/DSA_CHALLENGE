package DSA_CHALLENGE.Recursion;

public class selectionSortUsingRecursion {
    public static void SS(int[] arr) {
        int last = arr.length - 1;
        sorter(arr, 0, last);
    }

    public static void sorter(int[] arr, int start, int end) {
        if (end == 0)
            return;
        int max = getMaxIndex(arr , start , end);
        swap(arr , max , end);
        sorter(arr , start , end - 1);
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    public static void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        SS(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
