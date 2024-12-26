class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int num=(int)Math.floor(n*0.05);
        double sum=0;
        for(int i=num;i<n-num;i++){
            sum+=arr[i];
        }
        double mean=sum/(n-2*num);
        return mean;
        
    }
}