class Solution {
    public int fillCups(int[] amount) {
        int res=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:amount){
            if(num!=0)
                pq.offer(num);
        }
        if(pq.size()<1)
        {
            return 0;
        }
        while(pq.size()>1)
        {
            int val=pq.poll();
            int val1=pq.poll();
            val=val-1;
            val1=val1-1;
            if(val>0)
            {
                pq.add(val);

            }
            if(val1>0)
            {
                pq.add(val1);
            }
            res++;
        }
        if(pq.size()==1)
        {
        res+=pq.poll();
        }
        return res;
        
    }
}