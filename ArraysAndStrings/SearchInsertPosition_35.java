class Solution {
    // O(nlogn) Binary Search Approach
    public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length;
    while (left < right) {
      int middle = left + (right - left) / 2;
      if (nums[middle] == target)
        return middle;
      if (nums[middle] < target)
        left = middle + 1;
      else
        right = middle;
    }
    return left;
    }
}
        /* O(n) Approach
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target)
                return i;
        }
        if(target>=nums[nums.length-1])return nums.length;
        else return 0;
        */