public class Solution {
    private HashMap<Character, Integer> map;

    private void initialize(){
        map = new HashMap<>();
        map.put('-', 1);
        map.put('+', 1);
        map.put('*', 2);
        map.put('/', 2);
        map.put('^', 3);
    }

    private boolean isOperator(char ch){
        return map.containsKey(ch);
    }

    private int precedence(char ch){
        return map.get(ch);
    }

    public String solve(String expression) {
        initialize();
        Stack<Character> operators = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if(isOperator(ch)){
                while(!operators.isEmpty() && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek()))
                    sb.append(operators.pop());
                operators.push(ch);
            }
            else if(ch == '(') operators.push(ch);
            else if(ch == ')'){
                while(!operators.isEmpty() && operators.peek() != '(') sb.append(operators.pop());
                operators.pop();
            }
            else sb.append(ch);
        }
        while(!operators.isEmpty()) sb.append(operators.pop());
        return sb.toString();
    }
}
