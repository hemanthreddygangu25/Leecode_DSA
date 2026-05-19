class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
      int least=-1;
      HashSet<Integer> x=new HashSet<>();
      for(int i=0;i<nums2.length;i++)
      {
        x.add(nums2[i]);
      }
      for(int j=0;j<nums1.length;j++)
      {
        if(x.contains(nums1[j]))
        {
          least=nums1[j];
          break;
        }
      }
      return least;
        
    }
}