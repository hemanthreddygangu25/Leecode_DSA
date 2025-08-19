class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fc=0,tc=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                fc++;
            }
            else if(bills[i]==10)
            {
                if(fc>=1)
                {
                    fc=fc-1;
                    tc=tc+1;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(fc>=1 && tc>=1)
                {
                    fc=fc-1;
                    tc=tc-1;
                }
                else if(fc>=3)
                {
                    fc=fc-3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}