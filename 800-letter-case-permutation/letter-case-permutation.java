class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> x=new ArrayList<>();
        String ans="";
        int n=s.length();
        findcomb(ans,s,0,n,x);
        return x;
        
    }
    public void findcomb(String ans,String s,int i,int n,List<String> x)
    {
        
        if(i==n)
        {
            x.add(ans);
            return;
        }
        char ch=s.charAt(i);

        if(Character.isDigit(ch))
        {
            findcomb(ans+s.charAt(i),s,i+1,n,x);
        }
        else
        {
            findcomb(ans+Character.toLowerCase(ch),s,i+1,n,x);
            findcomb(ans+Character.toUpperCase(ch),s,i+1,n,x);
        }
        
    }
}