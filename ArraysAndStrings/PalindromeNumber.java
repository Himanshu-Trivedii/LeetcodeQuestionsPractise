class Solution {
    public boolean isPalindrome(int x) {
        int clone=x,rev=0;
        while(clone>0){
            int temp=clone%10;
            rev=rev*10+temp;
            clone/=10;
        }
        if(rev==x)
            return true;
        return false;
    }
}