class Solution {
    private static double median(int arr1[],int arr2[],int m,int n) {
    int finalArray[]=new int[n+m];
    int i=0,j=0,k=0;
    while(i<m && j<n) {
        if(arr1[i]<arr2[j]) {
            finalArray[k++] = arr1[i++];
        }
        else {
            finalArray[k++] = arr2[j++];
        }
    }
    if(i<m) {
        while(i<m) 
            finalArray[k++] = arr1[i++];
    }
    if(j<n) {
        while(j<n)
            finalArray[k++] = arr2[j++];
    }
    n = n+m;
    if(n%2==1) 
        return finalArray[((n+1)/2)-1];
    else return ((double)finalArray[(n/2)-1]+(double)finalArray[(n/2)])/2.0;
}
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return median(nums1,nums2,nums1.length,nums2.length);
    }
}