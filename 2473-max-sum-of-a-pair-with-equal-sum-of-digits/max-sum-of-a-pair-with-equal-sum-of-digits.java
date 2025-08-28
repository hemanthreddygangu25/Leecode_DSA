class Solution {
    public int maximumSum(int[] nums) {
        int[] map = new int[90];
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            int sum = sumOfDigit(nums[i]);
            if(map[sum]!=0) ans=Math.max(ans,nums[i]+map[sum]);
            map[sum] = Math.max(nums[i],map[sum]);
        }
        return ans;
        
    }
    public int sumOfDigit(int n){
        int sum=0;
        while(n>0){sum+=(n%10);n/=10;}
        return sum;
    }
}