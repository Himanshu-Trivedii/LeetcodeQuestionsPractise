class Solution {
    public static int addDigits(int num){
        // All multiples of 9 has sum of digits equal to 9
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
   /*private static int helper(int num,int sum){
        if(num/10==0)return num;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return helper(sum,0);
    }
    public static int addDigits(int num) {  
        return helper(num,0);
    }*/
}