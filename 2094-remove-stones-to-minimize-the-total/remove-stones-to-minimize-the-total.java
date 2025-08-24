
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int p : piles) {
            pq.add(p);
        }
        while (k-- > 0) {
            int max = pq.poll();                
            max -= max / 2;                     
            pq.add(max);                        
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
        
    }
}