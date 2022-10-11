class Solution {
    public int removeDuplicates(int[] nums) {
        int X = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[X] = nums[i];
                X++;
            }
        }
        return X;
    }
}