class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes<=k && k<=(numOnes+numZeros))
        {
            return numOnes;
        }
        if((numOnes+numZeros)<k)
        {
            int val=k-numOnes-numZeros;
            return numOnes-val;
        }
        if(k<=numOnes)
        {
            return k;
        }
        return 0;
        
    }
}