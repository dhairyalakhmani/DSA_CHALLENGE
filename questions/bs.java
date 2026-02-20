
public class bs {
    static void search(int[] arr, int target){
        int low=0,high=arr.length-1,mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==target){
            System.out.println("Number found at index = "+mid);
            break;
            }
            else if(arr[mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }

    }
    public static void main(String[] args) {
       int arr[]={2,3,4,5,6,7,8,10,24};
        search(arr,5);
    }
}
