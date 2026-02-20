public class sum_subarrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum=0;
        for(int i=0; i<5; i++){
            int j=5;
            while(i<=j){
                sum+=arr[i];
                j++;
            }
        } 
        System.out.println(sum);
    }
}
