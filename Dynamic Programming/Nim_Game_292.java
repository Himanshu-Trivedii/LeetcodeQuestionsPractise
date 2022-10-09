class Solution {
    public boolean canWinNim(int n) {
        return !(n%4==0);   
        // If a number is divisble by 4 then no chance of my winning else I have a 
        // chance to win.
    }
}