package DSA_CHALLENGE.BinarySearch;

public class painterProblem2 {
    public static int paint(int[] lengthOfBoards , int painters){
        int max = 0; int sum = 0;
        for(int i : lengthOfBoards){
            sum += i;
            max = Math.max(max , i);
        }
        int left = max , right = sum; int minimumTime = 0;
        while(left <= right){
            int requiredTime = left + (right - left) / 2;
            if(checkPaintTime(lengthOfBoards , requiredTime , painters)){
                minimumTime = requiredTime;
                right = requiredTime - 1;
            }
            else
                left = requiredTime + 1;
        }
        return minimumTime;
    }
    private static boolean checkPaintTime(int[] arr, int maxTime, int painters) {
        int currentPainters = 1;
        int sum = 0;
        for (int j : arr) {
            if (sum + j <= maxTime) {
                sum += j;
            } else {
                currentPainters++;
                sum = j;
                if (currentPainters > painters)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5 , 3 , 6 , 1 , 9};
        int painters = 2;
        System.out.println(paint(arr , painters));
    }
}
