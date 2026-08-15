class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right)
        {
            if(target-numbers[left]-numbers[right]>0)
            {
                left++;
            }
            else if(target-numbers[left]-numbers[right]<0)
            {
                right--;
            }
            else
            {
                break;
            }
        }
        int arr[]=new int[2];
        arr[0]=left+1;
        arr[1]=right+1;
        return arr;
    }
}
