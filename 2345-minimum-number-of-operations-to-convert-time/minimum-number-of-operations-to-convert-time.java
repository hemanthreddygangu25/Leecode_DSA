class Solution {
    public int convertTime(String current, String correct) {
        int start=gettime(current);
        int end=gettime(correct);
        int count=0;
        while(start<end)
        {
            int diff=end-start;
            if(diff>=60)
            {
                start+=60;
            }
            else if(diff>=15)
            {
                start+=15;
            }
            else if(diff>=5)
            {
                start+=5;
            }
            else
            {
                start+=1;
            }
            count++;
        }
        return count;
        
    }
    public int gettime(String s)
    {
        return Integer.parseInt(s.substring(0,2))*60+Integer.parseInt(s.substring(3));
    }
}