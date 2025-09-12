class Solution {
    public boolean doesAliceWin(String s) {
        Set<Character> x = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int vc=0;
        for(int i=0;i<s.length();i++)
        {
            if(x.contains(s.charAt(i)))
            {
                vc++;

            }
        }
        if(vc%2!=0)
        {
            return true;
        }
        else if (vc==0)
        {
            return false;
        }
        return true;
        
    }
}