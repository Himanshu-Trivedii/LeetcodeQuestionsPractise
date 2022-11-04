class Solution {
  public int superPow(int a, int[] b) {
    int ans = 1;
    a %= 1337;
    for (final int i : b)
      ans = powMod(ans, 10) * powMod(a, i) % 1337;
    return ans;
  }
  private int powMod(int x, int y) {
    int pow = 1;
    while (y-- > 0)
      pow = (pow * x) % 1337;
    return pow;
  }
}
