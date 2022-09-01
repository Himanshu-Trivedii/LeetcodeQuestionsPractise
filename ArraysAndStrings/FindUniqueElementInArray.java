class Solution {
    public int singleNumber(int[] nums) {
         int XorSum=0;
        for(int i:nums)
            XorSum^=i;
        return XorSum;
    }
}