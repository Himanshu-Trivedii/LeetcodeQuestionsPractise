class Solution {
    public char findTheDifference(String s, String t) {
        // int []arr=new int[256];
        // for(int i=0;i<t.length();i++){
        //     ++arr[(int)(t.charAt(i))];
        // }
        // for(int i=0;i<s.length();i++){
        //    --arr[(int)(s.charAt(i))];
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=0)return (char)(i);
        // }
        // return ' ';
        int charCodeS = 0, charCodeT = 0;   
        for (int i = 0; i < s.length(); ++i) 
            charCodeS += (int)s.charAt(i);
        for (int i = 0; i < t.length(); ++i) 
            charCodeT += (int)t.charAt(i);

        return (char)(charCodeT - charCodeS);
    }
}