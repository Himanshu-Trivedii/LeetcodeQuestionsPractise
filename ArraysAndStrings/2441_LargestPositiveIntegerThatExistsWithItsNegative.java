import java.util.Arrays;
class Solution {
    public int findMaxK(int[] nums) {
        if(nums.length==1)return -1;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;--i){
            if(nums[i]<0)return -1;
            if(BinarySearch(-nums[i],nums))return nums[i];
        }
        return -1;
    }
    private boolean BinarySearch(int target,int [] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(arr[middle]==target)return true;
            else if(arr[middle]<target){
                start=middle+1;
            }
            else{
                end=middle-1;
            }
        }
        return false;
    }
}