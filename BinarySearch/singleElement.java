package DSA_CHALLENGE.BinarySearch;

public class singleElement {
    public static int single(int[] arr){
        int n = arr.length;
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n - 1] != arr[n - 2]) return arr[n - 1];
        int i = 1 ; int j = n - 2;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == arr[mid - 1]){
                if((mid - 1) % 2 == 0) i = mid + 1;
                else j = mid - 1;
            }
            else if(arr[mid] == arr[mid + 1]){
                if(mid % 2 == 0) i = mid + 2;
                else j = mid - 1;
            }
            else return arr[mid];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2 , 2 , 3 , 3 , 4 , 5, 5 , 6, 6 , 7,7};
        System.out.println(single(arr));
    }
}
