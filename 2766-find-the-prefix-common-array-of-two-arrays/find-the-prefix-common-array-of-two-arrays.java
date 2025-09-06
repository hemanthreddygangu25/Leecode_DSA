class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
      int[] a1=new int[A.length+1];
      int[] a2=new int[B.length+1];
      int[] ans=new int[A.length];
      
      Arrays.fill(a1,0);
      Arrays.fill(a2,0);
      for(int i=0;i<A.length;i++)
      {
        int count=0;
        a1[A[i]]++;
        a2[B[i]]++;
        for(int j=1;j<=A.length;j++)
        {
          if(a1[j]>0 && a2[j]>0)
          {
            count++;
          }
        }
        ans[i]=count;

      }
      return ans;
        
    }
}