class Solution {
    public long dividePlayers(int[] skill) {
      HashSet<Integer> x=new HashSet<>();
      int i=0,j=skill.length-1;
      Arrays.sort(skill);
      while(i<j)
      {
        int sum=skill[i]+skill[j];
        x.add(sum);
        i++;
        j--;
      }
      if(x.size()==1)
      {
        long pro=0;
        i=0;
        j=skill.length-1;
        while(i<j)
        {
          int sum1=skill[i]*skill[j];
          pro+=sum1;
          i++;
          j--;
        }
        return pro;
      }
      return -1;
      
        
    }
}