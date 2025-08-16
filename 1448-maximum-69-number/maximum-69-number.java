class Solution {
    public int maximum69Number (int num) {
        String s=num+"";
        String s1="";
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='6' && flag<1)
            {
                s1+='9';
                flag++;

            }
            else
            {
                s1+=s.charAt(i);
            }

        }
        return Integer.parseInt(s1);
        
    }
}