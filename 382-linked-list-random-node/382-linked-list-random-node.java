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
    int size;
    HashMap<Integer, Integer> map;
    
    public Solution(ListNode head) {
        size = 0;
        map = new HashMap<>();
        ListNode temp = head;
        int i = 0;
        while(temp!=null){
            map.put(i, temp.val);
            temp = temp.next;
            i++;
            size++;
        }
    }
    
    public int getRandom() {
        Random rand = new Random();
        int randomIndex =  rand.nextInt(size);
        return map.get(randomIndex);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */