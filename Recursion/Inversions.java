package DSA_CHALLENGE.Recursion;

public class Inversions {
    public static int inversionCount(int[] arr) {
        return sort(arr, 0, arr.length - 1);
    }

    public static int sort(int[] arr, int start, int end) {
        int inversions = 0;
        int mid = (start + end) / 2;
        if (start < end) {
            inversions += sort(arr, start, mid);
            inversions += sort(arr, mid + 1, end);
            inversions += merge(arr, start, mid, end);
        }
        return inversions;
    }

    public static int merge(int[] arr, int start, int mid, int end) {
        System.out.println("Start: " + start + " End: " + end + " Mid: " + mid);
        int inversions = 0;
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
                inversions += mid - i + 1;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int b = 0; b < temp.length ; b++) {
            arr[start + b] = temp[b];
        }
        return inversions;
    }

    public static void main(String[] args) {
        int[] arr = {5 ,4, 1, 2, 5, 9, 10 ,8};
        System.out.println(inversionCount(arr));
    }
}
