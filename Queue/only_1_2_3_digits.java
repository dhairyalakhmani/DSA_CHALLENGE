public class Solution {
    public int[] solve(int A) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        int[] arr = new int[A];
        arr[0] = 1;
        int i = 0;
        while(i != A){
            arr[i] = queue.remove();
            queue.add(arr[i] * 10 + 1);
            queue.add(arr[i] * 10 + 2);
            queue.add(arr[i] * 10 + 3);
            i++;
        }
        return arr;
    }
}
