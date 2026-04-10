class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    void enqueue(int val){
        s1.push(val);
    }
    
    int dequeue(){
        if(!s2.isEmpty()){
            return s2.pop();
        }
        else{
            while(s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    int front(){
        if(!s2.isEmpty()){
            return s2.peek();
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    int rear(){
        if(!s1.isEmpty()){
            return s1.peek();
        }
        else{
            if(!s2.isEmpty()){
                while(!s2.isEmpty())
                    s1.push(s2.pop());
                return s1.peek();
            }
            else return -1;
        }
    }
    boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
}
