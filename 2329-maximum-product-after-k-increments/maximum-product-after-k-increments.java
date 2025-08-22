class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> x = new PriorityQueue<>();
        for(int i : nums){
            x.add(i); 
        }
        while(k-->0)
        {
            int val=x.poll();
            val=val+1;
            x.add(val);
        }
       
        long res = 1;
        int mod = 1000000007;
        while(!x.isEmpty()){
            res = ((res%mod)*(x.poll()%mod))%mod;
        }
        return (int)res;
        
    }
}