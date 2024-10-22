class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        
        int totalTank=0;
        int currentTank=0;
        int startIndex=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum1 +=gas[i];
            sum2 +=cost[i];
            currentTank+=gas[i]-cost[i];


        
        
        
                
                if(currentTank<0){
                    startIndex=i+1;
                    currentTank=0;
                }
                
                //return startIndex;

          
           

        }

        return sum1>=sum2?startIndex:-1;
        
    }
    
}