class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1="",ans2="";
        for(String s:word1)
            ans1+=s;
        for(String s:word2)
            ans2+=s;     
        return ans1.equals(ans2);
    }
}