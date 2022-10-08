class Solution {
    public boolean validMountainArray(int[] arr) {
            int i=0,size=arr.length;
            while(i<size-1 && arr[i]<arr[i+1])
                i++;
            if(i==0 || i==size-1) // Peak can't be 0 or arr.length-1
                return false;
            while(i<size-1 && arr[i]>arr[i+1])
                i++;
            return i==size-1; // if comes at last means valid else invalid
    }
}