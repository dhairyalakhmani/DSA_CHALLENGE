package DSA_CHALLENGE.BinarySearch;

public class paintersProblem {
    public static int paint(int[] arr , int T){
        int n = arr.length;
        int sum = 0 ; int painters = 0;
        for(int i = 0 ; i < n ; i++){
            if(sum + arr[i] <= T) sum += arr[i];
            else{
                painters++;
                sum = 0;
            }
        }
        return painters;
    }
}
