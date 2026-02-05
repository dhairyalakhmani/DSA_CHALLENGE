package DSA_CHALLENGE.Sorting;

import java.util.Arrays;

public class countSort {
    public static void COUNTSORT(int[] arr){
        int max = arr[0];
        for(int i : arr) if(i > max) max = i;
        int[] freqArr = new int[max + 1];
        for(int a : arr) freqArr[a]++;
        int index = 0;
        for(int i = 0; i <= max ; i++){
            while(freqArr[i] > 0){
                arr[index] = i;
                index++;
                freqArr[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2 , 3 , 3 , 6, 3 ,8 , 11 , 83, 37, 84, 8 , 33 ,66 , 2, 8, 37};
        COUNTSORT(arr);
        System.out.println(Arrays.toString(arr));
    }
}
