public class mergeSort2 {
    public void MergeSort(int[] arr){
        int s= 0;
        int e = arr.length - 1;
    }
    public void sorter(int[] arr , int s , int e){
        if(e - s <= 1)
            return;
        int mid = (s+e)/2;
        sorter(arr , s , mid);
        sorter(arr , mid+1 , e);

        merger(arr , s , mid , e );
    }
    public void merger(int[] arr , int s , int mid , int e){
        int[] temp = new int[e - s + 1];
        int i = s , j = mid + 1;
        while(i <= mid || j <= e){
            int arr1Number = (s <= mid) ? arr[i] : Integer.MAX_VALUE;
        }
    }
}
