class Solution {
    int func(long val){
        int count=0;
        while(val>0){
            if(val%2==1)count++;
            val=val/2;
        }
        return count;
    }
    public int makeTheIntegerZero(int num1, int num2) {
        for(int i=1;i<60;i++){
            long  val=(long )num1-(long )i*num2;
            if(val<0)return -1;
            int t=func(val); 
            if(t<=i && i<=val ){
                return i;
            }
            
        }
        return -1;
    }
}