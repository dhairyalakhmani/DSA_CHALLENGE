class MinStack {
    ListNode head = null;
    ListNode minHead = null;
    public MinStack() {
    }
    
    public void push(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        if(minHead == null || val <= minHead.val){
            ListNode minNode = new ListNode(val);
            minNode.next = minHead;
            minHead = minNode;
        }
    }
    
    public void pop() {
        if(head == null) return;
        if (head.val == minHead.val) {
            minHead = minHead.next;
        }
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        if(minHead != null)
            return minHead.val;
        return 0;
    }
}

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val){
        this.val = val;
        ListNode next = null;
    }
}
