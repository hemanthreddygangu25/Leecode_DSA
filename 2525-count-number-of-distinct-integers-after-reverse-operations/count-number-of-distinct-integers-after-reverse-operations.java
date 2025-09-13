class Solution {
    public int countDistinctIntegers(int[] nums) {
      HashSet<Integer> x=new HashSet<>();
      for(int i:nums)
      {
        x.add(i);
      }
      for(int j:nums)
      {
        x.add(reverse(j));
      }
      return x.size();

        
    }
    public static int reverse(int num) {
        while (num % 10 == 0)
            num /= 10;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
}
}