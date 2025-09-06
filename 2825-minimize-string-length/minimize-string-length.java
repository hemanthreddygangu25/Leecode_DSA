class Solution {
    public int minimizedStringLength(String s) {
      HashSet<Character> x=new HashSet<>();
      for(char i:s.toCharArray())
      {
        x.add(i);
      }
      return x.size();
        
    }
}