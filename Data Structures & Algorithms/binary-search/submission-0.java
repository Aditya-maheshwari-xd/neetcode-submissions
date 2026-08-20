class Solution {
    public int search(int[] nums, int target) {
        int ans = binary(0,nums.length-1,target,nums);
        return ans;
    }
    public int binary(int left,int right,int target,int[] nums)
    {
        int mid = left +(right-left)/2;
        if(left>right)
        {
            return -1;
        }
        if(nums[mid]==target)
        {
            return mid;
        }
        if(nums[mid]>target)
        {
            return binary(left,mid-1,target,nums);
        }
        if(nums[mid]<target)
        {
            return binary(mid+1,right,target,nums);
        }
        
        return -1;
    }
}
