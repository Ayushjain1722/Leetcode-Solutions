//Node structure
class Node{
    Node links[] = new Node[2];
    public boolean isPresent(int bit){
        return links[bit]!=null;
    }
    public Node get(int bit){
        return links[bit];
    }
    public void set(int bit, Node node){
        links[bit] = node;
    }
}
//Trie Structure
class Trie{
    private static Node root;
    
    Trie(){
        root = new Node();
    }
    
    public void insert(int num){
        Node node = root;
        for(int i=31;i>=0;i--){
            int bit = (num >> i) & 1;
            if(!node.isPresent(bit)){
                node.set(bit, new Node());
            }
            node = node.get(bit);
        }
    }
    
    public int getMax(int n){
        Node node = root;
        int maxNum = 0;
        for(int i=31;i>=0;i--){
            int bit = (n >> i) & 1;
            if(node.isPresent(1-bit)){
                maxNum = maxNum | (1 << i);
                node = node.get(1-bit);
            }else{
                node = node.get(bit);
            }
        }
        return maxNum;
    }
}
class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();
        for(int i=0;i<nums.length;i++){
            trie.insert(nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(trie.getMax(nums[i]), max);
        }
        
        return max;
    }
}