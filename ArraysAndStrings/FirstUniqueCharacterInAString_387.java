//O(n)
class Solution {
    public int firstUniqChar(String s) {
        if(s.length()<=1)return 0;
        int charArr[]=new int[255];
        for(int i=0;i<s.length();i++){
            charArr[(int)(s.charAt(i))]++;
        }
        for(int i=0;i<s.length();i++)
            if(charArr[(int)(s.charAt(i))]==1)
                return i;
        return -1;
    }
}