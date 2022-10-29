//T.C- O(nlogn) S.C-> O(1)
class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
         int n  = plantTime.length;
		//create a multi-dim array
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = growTime[i];
            arr[i][1] = plantTime[i];
        }
		//sort array according to max grow time first
        Arrays.sort(arr,(a,b)->(b[0]-a[0])); // Sort in Descending Order
        int time=0;
        int max=0;
		//plant max grow time first and keep track of max time it can take
        for(int i=0;i<n;i++){
            time += arr[i][1];
            max = Math.max(max,time+arr[i][0]);
        }
        return max;
    }
}

/*        int n = growTime.length;
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            indices.add(i);
        }
        Collections.sort(indices, Comparator.comparingInt(i -> -growTime[i]));
        int result = 0;
        for (int i = 0, curPlantTime = 0; i < n; ++i) {
            int idx = indices.get(i);
            int time = curPlantTime + plantTime[idx] + growTime[idx];
            result = Math.max(result, time);
            curPlantTime += plantTime[idx];
        }
        return result;*/