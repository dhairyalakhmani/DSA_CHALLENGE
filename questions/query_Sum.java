public class query_Sum {
    public int[] calculate(int[] A, int[][]Q){
        for(int i=0; i<Q.length; i++){
            int index = Q[i][0];
            int value = Q[i][1];
            A[index] += value;
        }

        int[] Psum = new int[A.length];
        Psum[0] = A[0];
        for(int i=1; i<A.length; i++){
            Psum[i] = Psum[i-1] + A[i];
        }
        return Psum;
    }

    public static void main(String[] args) {
        
    }
}
