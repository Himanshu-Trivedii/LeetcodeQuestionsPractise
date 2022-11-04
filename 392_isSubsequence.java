class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)return true;
        if(t.length()==0 && s.length()!=0)return false;
        for(int i=0;i<t.length();++i){
            if(s.length()!=0 && s.charAt(0)==t.charAt(i)){
                s=s.substring(1);continue;
            }
        }
        return s=="";
    }
}