class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] s=new int[26];
        int[] s1=new int[26];
        for(char i:word1.toCharArray())
        {
            s[i-'a']++;
        }
        for(char j:word2.toCharArray())
        {
            s1[j-'a']++;
        }
        for(int i=0; i<26; i++){
            if((s[i]==0 && s1[i]!=0) || (s1[i]==0 && s[i]!=0))           return false;
        }
        Arrays.sort(s);
        Arrays.sort(s1);

        for(int k=0;k<26;k++)
        {
            
            if(s[k]!=s1[k])
            {
                return false;
            }
        }
        
        return true;
        
    }
}