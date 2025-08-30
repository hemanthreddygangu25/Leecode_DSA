class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int t=*max_element(candies.begin(),candies.end());
        int n=candies.size();
       vector<bool>ans(n);
       for(int i=0;i<n;i++){
        if((candies[i]+extraCandies)>=t){
            ans[i]=true;
        }
        else{
            ans[i]=false;
        }
       }
       return ans;
    }
};