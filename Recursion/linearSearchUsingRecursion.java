package DSA_CHALLENGE.Recursion;

public class linearSearchUsingRecursion {
    public static boolean search(int[] arr , int target){
        return ls(arr , target , 0);
    }
    public static boolean ls(int[] arr , int target , int index){
        if(index >= arr.length) return false;
        return arr[index] == target || ls(arr , target , index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2 , 6, 1 ,6 ,6 , 6,2,6,6,372,2,6,7,26,27,27,22};
        int target = 372;
        System.out.println(search(arr , target));
    }
}
