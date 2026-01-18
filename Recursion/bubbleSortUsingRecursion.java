public class bubbleSortUsingRecursion {
    public static void sort(int[] arr){
        int i = 0 , j = 1;
        bubbleSort(i , j , arr);
    }
    private static void bubbleSort (int i , int j , int[] arr){
        if(i >= arr.length - 1) return;
        if(j >= arr.length - i){
            bubbleSort(i + 1 , 1 , arr);
            return;
        }
        if(arr[j] < arr[j - 1]){
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        }
        bubbleSort(i , j + 1 , arr);
    }

    public static void main(String[] args) {
        int[] arr = {5 , 4, 7 ,3 ,7 ,8, 2 ,1};
        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
