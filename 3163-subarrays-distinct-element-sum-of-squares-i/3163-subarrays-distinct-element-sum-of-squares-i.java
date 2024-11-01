class Solution {
    public int sumCounts(List<Integer> nums) {
         int n = nums.size();  
        int totalSum = 0;  

        
        for (int i = 0; i < n; i++) {  
            HashSet<Integer> distinctElements = new HashSet<>();  
            
            for (int j = i; j < n; j++) {  
                distinctElements.add(nums.get(j));  
                int distinctCount = distinctElements.size();  
                totalSum += distinctCount * distinctCount;  
            }  
        }  

        return totalSum; 
        
        
    }
}