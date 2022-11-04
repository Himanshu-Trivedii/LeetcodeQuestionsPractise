class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums.length==0)return nums;
         int temp;
        for(int i=0;i<nums.length;++i){
            temp=nums[i];
            nums[i]=temp*temp;
        }
            
        Arrays.sort(nums);
        return nums;
    }
}