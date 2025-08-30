class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
    int t=accumulate(gas.begin(),gas.end(),0);
    int y=accumulate(cost.begin(),cost.end(),0);
    if(t<y)return -1;
    int ans=0;
    int total=0;
    for(int i=0;i<gas.size();i++){
           total+=gas[i]-cost[i];
           if(total<0){
            total=0;
            ans=i+1;
           }
    }
    return ans;
    }
};