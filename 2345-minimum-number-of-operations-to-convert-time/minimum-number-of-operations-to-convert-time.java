class Solution {
    public int convertTime(String current, String correct) {
        int start=gettime(current);
        int end=gettime(correct);
        int count=0;
        int diff=end-start;
        return diff / 60 + (diff % 60) / 15 + (diff % 15) / 5 + diff % 5;
        
    }
    public int gettime(String s)
    {
        return Integer.parseInt(s.substring(0,2))*60+Integer.parseInt(s.substring(3));
    }
}