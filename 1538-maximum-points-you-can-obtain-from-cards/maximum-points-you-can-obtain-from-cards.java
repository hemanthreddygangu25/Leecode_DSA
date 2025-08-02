class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n = cardPoints.length-1;
      int answer,leftSum,rightSum; 
      answer=leftSum=rightSum=0;
      for(int i =0; i<k;i++){
         leftSum += cardPoints[i];
      } 
      answer = leftSum;
      for(int i= k-1;i>=0;i--){ 
         leftSum-=cardPoints[i];
         rightSum+=cardPoints[n--]; 
         answer = Math.max((leftSum+rightSum),answer);
      }  
      return answer;
    }
}