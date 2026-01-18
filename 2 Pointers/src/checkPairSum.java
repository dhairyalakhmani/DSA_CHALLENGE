import java.util.Arrays;
public class checkPairSum {
    public static void main(String[] args) {
        int[] arr = {4, 5 , 2 ,6, 2,6,8,8,443,72,2,73,637,3,6};
//         6 7 9 10 12 15
        Arrays.sort(arr);
        int k = 80;
        int s = 0;
        int e = arr.length - 1;
        int count = 0;
        while(s < e){
            int sum = arr[s] + arr[e];
            if(sum == k){
                count += 1;
                s++;
                e--;
            }
            else if(sum > k)
                e--;
            else
                s++;
        }
        System.out.println(count);
    }
}
