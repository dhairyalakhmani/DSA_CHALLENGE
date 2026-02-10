package DSA_CHALLENGE.BinarySearch;
// We have to return the first occurrence of the target element, or -1.
public class binarySearchWithRepetitions {
    public static int bs(int[] arr , int target){
        int s = 0 ; int e = arr.length - 1;
        int minIndex = -1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] < target) e = mid - 1;
            else if(arr[mid] > target) s = mid + 1;
            else{
                minIndex = mid;
                e = mid - 1;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 2 , 4 , 5 , 6 , 6 , 6 , 7 , 8, 35 , 35 , 23 , 84};
        int target = 5;
        System.out.println(bs(arr , target));
    }
}
