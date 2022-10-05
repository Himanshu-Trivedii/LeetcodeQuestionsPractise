class Solution {
    private static String Reverse(String str){
        if(str.length()<=1)return str;
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }
        return ans;
    }
    public String reverseWords(String s) {
        String []StrArr=s.split(" ");
        String ans="";
        for(int i=0;i<StrArr.length;i++){
            if(i+1!=StrArr.length)
                ans+=Reverse(StrArr[i])+" ";
            else
                ans+=Reverse(StrArr[i]);
        }
        return ans;
    }
}