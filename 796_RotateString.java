class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
        // if(s.length()!=goal.length())return false;
        // if(s.equals(goal))return true;  
    }
     // Contains function works internally by substrings matching
}