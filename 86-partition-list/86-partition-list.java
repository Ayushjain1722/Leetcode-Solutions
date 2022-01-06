/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode before_head = new ListNode(0);
        ListNode before_ptr = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after_ptr = after_head;
        while(head!=null){
            if(head.val < x){
                before_ptr.next = head;
                before_ptr = before_ptr.next;
            }else{
                after_ptr.next = head;
                after_ptr = after_ptr.next;
            }
                
            head = head.next;
        }
        after_ptr.next = null;
        before_ptr.next = after_head.next;
        return before_head.next;
        
        
    }
}