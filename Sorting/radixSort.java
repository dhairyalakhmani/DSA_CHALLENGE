package DSA_CHALLENGE.Sorting;

public class radixSort {
    public static void Radix (int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i > max)
                max = i;
        }
        for(int exp = 1 ; max/exp > 0 ; exp*=10){
            countSort(arr , exp);
        }
    }
    private static void countSort(int[] arr , int exp){
        int n = arr.length;
        int[] count = new int[10];
        int[] output = new int[n];

        for(int i : arr){
            count[(i / exp) % 10]++;
        }
    }
}
