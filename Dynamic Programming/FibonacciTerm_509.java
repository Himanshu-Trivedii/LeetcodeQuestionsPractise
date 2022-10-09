//Time: O(n)O(n)
//Space: O(1)O(1)
class Solution {
  public int fib(int N) {
    if (N < 2)
      return N;
    int[] dp = {0, 0, 1}; // Additional index is just for storing answer value
    for (int i = 2; i <= N; ++i) {
      dp[0] = dp[1];
      dp[1] = dp[2];
      dp[2] = dp[0] + dp[1];
    }
    return dp[2];
  }
}
