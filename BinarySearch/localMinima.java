package DSA_CHALLENGE.BinarySearch;

public class localMinima {

    public static int findLocalMinima(int[] arr) {
        int n = arr.length;

        if (n == 1) return 0;
        if (arr[0] < arr[1]) return 0;
        if (arr[n - 1] < arr[n - 2]) return n - 1;

        int s = 1, e = n - 2;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 8, 10, 9, 7, 11, 10};
        System.out.println(findLocalMinima(arr));
    }
}
