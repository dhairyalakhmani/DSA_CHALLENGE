package DSA_CHALLENGE.BinarySearch;

import java.util.Arrays;

public class binarySearch {
    public static boolean search (int[] arr , int target){
        int s = 0; int e = arr.length - 1;
        boolean found = false;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(target > arr[mid]) s = mid + 1;
            else if(target < arr[mid]) e = mid - 1;
            else{
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = {2 ,24, 546 ,64, 64 , 6 ,463, 66,363,574 ,37 ,73 ,363,6 ,793, 6737,73,73};
        Arrays.sort(arr);
        int target = 574;
        System.out.println(search(arr , target));
    }
}
