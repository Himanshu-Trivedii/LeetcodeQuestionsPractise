// O(n) T.C 
// O(1) S.C
class Solution {
    public boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i+1])
                increasing = false;
            if (A[i] < A[i+1])
                decreasing = false;
        }

        return increasing || decreasing;
    }
}
/* O(n^2) T.C 
 O(1) S.C
class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1)return true;
        boolean StrictlyIncreasing=false,StrictlyDecreasing=false;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i]>nums[i+1])StrictlyDecreasing=true;
            if(i+1<nums.length && nums[i]<nums[i+1])StrictlyIncreasing=true;      
            if(StrictlyDecreasing){
                for(int j=i;j<nums.length-1;j++){
                    if(nums[j]<nums[j+1])return false;
                }   
                return true;
            }
            if(StrictlyIncreasing){
                for(int j=i;j<nums.length-1;j++){
                    if(nums[j]>nums[j+1])return false;
                }
                return true;
            }
        }
        return true;
    }
}*/
