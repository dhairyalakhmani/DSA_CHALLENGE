public class Solution {
    public int solve(int[] A, int[] B) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for(int num : A) queue.offer(num);
        for(int num : B){
            while(!queue.isEmpty() && num != queue.peek()){
                int task = queue.poll();
                queue.offer(task);
                count++;
            }
            queue.poll();
            count++;
        }
        return count;
    }
}
