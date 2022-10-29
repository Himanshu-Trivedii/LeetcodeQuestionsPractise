class Solution {
    public void sortColors(int[] nums) {
        MergeSort(nums,0,nums.length-1);
    }
   private static void MergeSort(int[] input,int startIndex,int endIndex){
        if(startIndex>=endIndex)
            return;
        int mid=startIndex + (endIndex - startIndex)/2;
        MergeSort(input,startIndex,mid);
        MergeSort(input,mid+1,endIndex);
        MergeTwoSortedArrays(input,startIndex,endIndex);
    }
    private static void MergeTwoSortedArrays(int []input,int startIndex,int endIndex){
        int middle=startIndex + (endIndex - startIndex)/2;
        int []arr=new int[endIndex-startIndex+1];
        int i=startIndex,j=middle+1,k=0;      
        while(i<=middle && j<=endIndex){
            if(input[i]>input[j]){
                arr[k]=input[j];
                k++;j++;
            }
            else{
                arr[k]=input[i];
                k++;i++;
            }            
        }
        while(i<=middle){
            arr[k]=input[i];
            k++;i++;
        }
        while(j<=endIndex){
            arr[k]=input[j];
            k++;j++;
        }
        /* When we pass an array to a method as an argument, actually the address of the array in the memory 
is passed (reference).Therefore, any changes to this array in the method will affect the array  */
        for(int a=0;a<arr.length;a++){
            input[startIndex+a]=arr[a];
        }
    }
}