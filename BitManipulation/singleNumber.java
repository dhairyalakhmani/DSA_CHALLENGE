package DSA_CHALLENGE.BitManipulation;
//Every number here is repeating 3 times except for one number, we have to find that number
public class singleNumber {
    public static int single(int[] A){
        int n = A.length;
        int ans = 0;
        for(int i = 0 ; i < 32 ; i ++){
            int sum = 0;
            for(int j = 0; j < n ; j++){
                int pos = A[j];
                if((pos & (1 << i)) != 0) sum++;
            }
            if(sum % 3 == 1)
                ans = ans | (1 << i);
            else
                ans = ans & ~(1 << i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 2 , 1 , 3 , 6 , 6 , 6 , 3 , 2 , 1};
        System.out.println(single(arr));
    }
}
