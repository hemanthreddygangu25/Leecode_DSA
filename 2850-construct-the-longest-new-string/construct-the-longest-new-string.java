class Solution {
    public int longestString(int x, int y, int z) {
        String s="";
        for(int i=0;i<z;i++)
        {
            s+="AB";
        }
        int mini=Math.min(x,y);
        for(int j=0;j<mini;j++)
        {
            s+="AA";
            s+="BB";
            x--;
            y--;
        }
        if(x!=0)
        {
            s+="AA";
        }
        if(y!=0)
        {
            s+="BB";
        }
        return s.length();
    }
}