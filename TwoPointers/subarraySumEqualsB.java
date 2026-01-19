package DSA_CHALLENGE.TwoPointers;

import org.w3c.dom.ls.LSOutput;

public class subarraySumEqualsB {
    public static void main(String[] args){
        int[] A = {4, 2, 10, 6, 8, 2, 6, 2};
        int B = 26;
        int len = A.length;
        int i = 0;
        int j = 0;
        int sum = 0;

        while (j < len) {
            sum += A[j];
            if (sum == B)
                System.out.println("True");
            else if (sum < B)
                j++;
            else {
                sum -= A[i];
                i++;
            }
        }
        System.out.print("false");
    }
}
