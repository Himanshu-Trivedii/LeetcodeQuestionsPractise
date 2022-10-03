import java.util.*;
import java.util.Map.Entry;
/*
                    ALTERNATE APPROACH
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
*/
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i]) +1);
            else 
                map.put(nums[i],1);
        }
          int max_count = 0, res = -1;
         
        for(Entry<Integer, Integer> val : map.entrySet()){
            if (max_count < val.getValue()){
                res = val.getKey();
                max_count = val.getValue();
            }
        }
         
        return res;
        
    }
}
