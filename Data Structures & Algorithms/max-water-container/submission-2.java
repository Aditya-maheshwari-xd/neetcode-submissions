class Solution {
    public int maxArea(int[] heights) {
        int width = heights.length-1;
        int left=0;
        int right = heights.length-1;
        int ans = Math.min(heights[left],heights[right])*width;
        int max=0;
        while(left<right)
        {
            max = Math.min(heights[left],heights[right])*(right-left);
            if(heights[left]<heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            if(max>ans)
            {
                ans=max;
            }
        }
        return ans;
    }
}
