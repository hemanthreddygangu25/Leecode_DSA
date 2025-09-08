import java.util.*;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness); 
        int n = happiness.length;
        long ans = 0;
        
       
        for (int i = 0; i < k; i++) {
            int val = happiness[n - 1 - i] - i;
            if (val > 0) ans += val;
        }
        
        return ans;
    }
}
