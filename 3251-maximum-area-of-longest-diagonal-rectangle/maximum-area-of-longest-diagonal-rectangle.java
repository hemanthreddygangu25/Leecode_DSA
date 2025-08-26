class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans=0;
        double maxi=0;
        for(int i=0;i<dimensions.length;i++)
        {
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            double val=(double)Math.sqrt(1.0*l*l+1.0*w*w);
            if(val>maxi)
            {
                ans=l*w;
                maxi=val;
            }
            else if(maxi==val)
            {
                int ans1=l*w;
                int ans2=ans;
                if(ans1>ans2)
                {
                    ans=ans1;
                }
                
            }
        }
        return ans;
        
    }
}