// Definition for singly-linked list.
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}
 
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        if(A == null || A.next == null) return A;
        ListNode temp = A;
        if(temp.val == temp.next.val){
            temp.next = temp.next.next;
            deleteDuplicates(temp);
        }
        else{
            temp = temp.next;
            deleteDuplicates(temp);
        }
        return A;
    }
}
