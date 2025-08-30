class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int ls=-1;
        int maxval=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                if(ls!=-1)
                {
                    maxval=Math.max(maxval,i-ls);
                }
                ls=i;
            }
        }
        return maxval;
        
    }
}