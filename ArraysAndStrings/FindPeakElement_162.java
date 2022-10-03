class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        if(nums.length==2){
            if(nums[0]>nums[1])return 0;
            return 1;
        }
        int peakIndex=0,i=1,prev=i-1,current=i,next=i+1;
        while(i+1<nums.length){
            if(nums[i]>nums[prev] && nums[i]>nums[next])
                return i;           
            i++;prev++;current++;next++;
        }
        if(nums[i]>nums[i-1] && peakIndex<nums[i])
            peakIndex=i;
        return peakIndex;
    }
}