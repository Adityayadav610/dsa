
class Solution {  
    public int[] resultsArray(int[] nums, int k) {  
        int n = nums.length;
        List<Integer> lst=new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            boolean isConsecutive = true;
            int maxVal = nums[i];

            for (int j = i; j < i + k - 1; j++) {
                if (nums[j] + 1 != nums[j + 1]) {
                    isConsecutive = false;
                    break;
                }
                maxVal = Math.max(maxVal, nums[j + 1]);
            }

           // ans.add(isConsecutive ? maxVal : -1);
        
            
            
            if (isConsecutive) {  
                lst.add(maxVal);  
            } else {  
                lst.add(-1);  
            }  
          
        
        }
        return lst.stream().mapToInt(i -> i).toArray();  
    }  
}