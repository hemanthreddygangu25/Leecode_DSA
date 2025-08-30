class Solution {
public:
    int firstCompleteIndex(vector<int>& arr, vector<vector<int>>& mat) {
        map<int,int>mpp;
        for(int i=0;i<arr.size();i++){
            mpp[arr[i]]=i;
        }
        int m=mat.size();
        int n=mat[0].size();
        int maxi=INT_MAX;
      
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
              sum=max(sum,mpp[mat[i][j]]);
            }
            maxi=min(maxi,sum);
           
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum=max(sum,mpp[mat[j][i]]);
            }
           maxi=min(maxi,sum);
        }
        return maxi;
    }
};