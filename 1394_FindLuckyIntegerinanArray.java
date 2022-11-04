class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int key : arr)
            map.put(key, map.getOrDefault(key, 0) + 1);
        int max = -1;
        for(int key : map.keySet()){
            if(key == map.get(key) && key > max)
                max = key;
        }
        return max;
    }
}