class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> answer = new HashMap<>() ;
       int[] arr=new int[2];
       for(int i=0;i<nums.length;i++)
       {
       
        if(answer.containsKey(target-nums[i]))
        {
            arr[0]=answer.get(target-nums[i]);
            arr[1]=i;
        }
        else
        {
            answer.put(nums[i],i);
        }
       }
       return arr;
       
    }
}
