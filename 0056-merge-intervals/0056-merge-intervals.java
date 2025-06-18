class Solution {
    public int[][] merge(int[][] intervals) {
       if (intervals.length == 0) {  
            return new int[0][0];  
        }  

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));  
        List<int[]> ans=new ArrayList<>();
        int[] currInterval=intervals[0];
        ans.add(currInterval);
        for(int[] interval:intervals){
            int currStart=currInterval[0];
            int currEnd=currInterval[1];
            int nextStart=interval[0];
            int nextEnd=interval[1];
            if(currEnd>=nextStart){
                currInterval[1]=Math.max(currEnd,nextEnd);
            }else{
                currInterval=interval;
                ans.add(currInterval);
            }
        } 
        return ans.toArray(new int[ans.size()][]);
        
    }
}