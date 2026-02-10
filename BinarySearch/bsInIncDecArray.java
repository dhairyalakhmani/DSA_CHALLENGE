package DSA_CHALLENGE.BinarySearch;

public class bsInIncDecArray {
    public static int mountainSearch(int[] arr){
        int s = 0 ; int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
            else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5 , 8 , 10 , 12 , 14 , 9 , 6 , 1};
        System.out.println(mountainSearch(arr));
    }
}
// 5 8 10 12 14 9 6 1