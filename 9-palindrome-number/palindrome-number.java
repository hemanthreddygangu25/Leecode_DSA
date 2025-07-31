class Solution {
    //Hemanth
    public boolean isPalindrome(int x) {
        int n=x;
        int rev = 0; 
        if(x==0)
         {
            return true;
         }
   
        int rem; 
  
        while (x > 0) { 
            rem = x % 10; 
            rev = (rev * 10) + rem; 
            x = x / 10; 
        }
        if(rev==n)
        {
            return true;
        }
       
    
     return false;
}
}