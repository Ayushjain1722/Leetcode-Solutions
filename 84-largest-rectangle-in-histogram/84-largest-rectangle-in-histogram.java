class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i<heights.length)
        {
            // System.out.println(maxArea);
            if(st.isEmpty() || heights[st.peek()] <= heights[i])
            {
                st.push(i);
                i++;
            }
            else
            {
                while(!st.isEmpty() && heights[i]<heights[st.peek()])
                {
                    int currMax = st.peek();
                    st.pop();
                    int area = heights[currMax] * (i-(st.isEmpty()?0 :st.peek()+1));
                    maxArea = Math.max(maxArea,area);
                }
                st.push(i);
                i++;
            }
        }
        while(!st.isEmpty())
        {
            int currMax = st.pop();
            int area = heights[currMax] * (heights.length-(st.isEmpty()?0:st.peek()+1));
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}