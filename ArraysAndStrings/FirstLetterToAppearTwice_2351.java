// O(n)
class Solution {
    public char repeatedCharacter(String s) {
        int charArr[]=new int[255];
        for(int i=0;i<s.length();i++){
            int count= ++charArr[(int)(s.charAt(i))];
            if( count==2 )
                return s.charAt(i);
        }
        return ' ';
    }
}