package DSA_CHALLENGE.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,72,22,8,1,7};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int count = 0; // counts if no swapping takes place and hence the array must have been sorted so breaks if count = 0
            for(int j = 1; j < n - i; j++){  // loop runs till n-i as after every iteration the max element moves to the end therefore we don't need to check it again.
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    count++;
                }
            }
            if(count == 0) break;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
