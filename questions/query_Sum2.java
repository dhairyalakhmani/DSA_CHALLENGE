package interviewQues;

public class query_Sum2 {
    
    public int[] calculateIt(int[] A, int[][] Q, int x){
        for(int i=0; i<Q.length; i++){
            int left = Q[i][0];
            int right = Q[i][1];
            int value = Q[i][2];

            A[left] += value;
            if(right<A.length){
                A[right] -= value;
            }
        }
        int[] Psum = new int[A.length];
        Psum[0] = A[0];
        for(int i=1; i<A.length; i++){
            Psum[i] = Psum[i-1] + A[i];
        }
        return Psum;
    }

}

