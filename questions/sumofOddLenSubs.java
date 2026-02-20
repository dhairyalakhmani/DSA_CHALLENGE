public class sumofOddLenSubs {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int sumOdd = 0;
        int pos = 1;
        for (int i = 0; i < 5; i++) {
            if(pos % 2 != 0)
                sumOdd += arr[i] * ((((i + 1) * (5 - i)) + 1) / 2); /// Jab positions odd hoti hain starting index ki,tab no. of odd length subs even se ek zyada hoti hai
            else
                sumOdd += arr[i] * (((i + 1) * (5 - i)) / 2);
            pos++;
        }
        System.out.println(sumOdd);
    }
}

