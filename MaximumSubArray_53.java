import java.lang.Math;
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int Sum=nums[0];
        int MaxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(Sum<0)
                Sum=nums[i];
            else
                Sum+=nums[i];
            MaxSum=Math.max(Sum,MaxSum);
        }
        return MaxSum;
    }
}