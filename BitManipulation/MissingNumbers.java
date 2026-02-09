package DSA_CHALLENGE.BitManipulation;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MissingNumbers {
    public static int[] solve(int[] A) {
        int N = A.length;
        int XOR = 0;
        int sumElements = 0;
        int[] output = new int[2];
        for(int i : A){ XOR = XOR ^ i; sumElements += i;}
        for(int j = 1 ; j <= N+2 ; j++){
            XOR = XOR ^ j;
//            System.out.println("XOR :" + XOR);
        }
        int total = (N + 2) * (N + 3) / 2;
        int sumMissing = total - sumElements;

        for(int k = 1 ; k <= N+2 ; k++){
            int num1 = k;
            int num2 = sumMissing - k;
            System.out.println("num1 : " + num1 + " num2 : " + num2);
            if((num1 ^ (num2 ^ XOR)) == 0){
                System.out.println(num1 + "^" + num2 + "^" + XOR + "=" + (num1 ^ (num2 ^ XOR)));
                output[0] = Math.min(num1 , num2);
                output[1] = Math.max(num1 , num2);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 6};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
