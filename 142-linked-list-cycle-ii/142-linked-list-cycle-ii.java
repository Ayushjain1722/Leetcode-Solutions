/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> set = new HashMap<>();
        ListNode temp = head;
        int ind = 0;
        while(temp!=null){
            if(set.containsKey(temp))
                return temp;
            set.put(temp, ind++);
            temp = temp.next;
        }
        return temp;
    }
}