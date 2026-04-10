class Queue {
    List<Integer> list = new ArrayList<>();
    int front = 0;
    int rear = -1;
    void enqueue(int val){
        rear++;
        list.add(val);
    }
    int dequeue(){
        if(rear < front) return -1;
        int ans = list.get(front);
        front++;
        return ans;
    }
    int front(){
        if(front > rear) return -1;
        return list.get(front);
    }
    int rear(){
        if(front > rear) return -1;
        return list.get(rear);
    }
    boolean isEmpty(){
        return front > rear;
    }
}
