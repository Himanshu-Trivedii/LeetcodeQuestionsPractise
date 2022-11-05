class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length,start = 1;
        Arrays.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();   
        for(int i = 1; i <= len; i++){
            if(Arrays.binarySearch(nums, i) < 0){
                result.add(i);
            }
        }
        return result;
    }
}