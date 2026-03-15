class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            while(!stack.isEmpty() && stack.peek() >= num)
                stack.pop();
            if(stack.isEmpty()) list.add(-1);
            else list.add(stack.peek());
            stack.push(num);
        }
        return list;
    }
}
