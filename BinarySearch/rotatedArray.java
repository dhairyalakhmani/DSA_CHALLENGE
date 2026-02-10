package DSA_CHALLENGE.BinarySearch;

public class rotatedArray {

    public static int rotatedSearch(int[] arr, int k) {
        int n = arr.length;

        int peak = findPeak(arr);

        if (arr[peak] == k) return peak;

        int left = binarySearch(arr, 0, peak - 1, k);
        if (left != -1) return left;

        return binarySearch(arr, peak + 1, n - 1, k);
    }

    private static int findPeak(int[] arr) {
        int s = 0, e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    private static int binarySearch(int[] arr, int s, int e, int k) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == k) return mid;
            if (arr[mid] < k) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int k = 6;
        System.out.println(rotatedSearch(arr, k));
    }
}