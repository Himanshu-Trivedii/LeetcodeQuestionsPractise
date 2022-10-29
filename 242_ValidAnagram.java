class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int arr[]=new int[255];
        int size=s.length();
        for(int i=0;i<size;i++){
            ++arr[(int)(s.charAt(i))];
            --arr[(int)(t.charAt(i))];
        }
        for(int i:arr){
            if(i!=0)return false;
        }
        return true;
    }
}