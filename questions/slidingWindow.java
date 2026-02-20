public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,-5,4};
        int curr=arr[0],max=arr[0];
        for(int i=1; i<8; i++){
            curr=Math.max(curr+arr[i],arr[i]);
            if(curr>max)
                max=curr;
        }        
        System.out.println(max);
    }
}