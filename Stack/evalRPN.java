public class Solution {
    public int evalRPN(String[] A) {
        Stack<Integer> stack = new Stack<>();
        for (String s : A) {
            if (isOperator(s)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(operate(num2, num1, s));
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String ch) {
        return ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/");
    }

    private int operate(int num1, int num2, String operator) {
        if (operator.equals("*")) return num1 * num2;
        if (operator.equals("+")) return num1 + num2;
        if (operator.equals("-")) return num1 - num2;
        return num1 / num2;
    }
}
