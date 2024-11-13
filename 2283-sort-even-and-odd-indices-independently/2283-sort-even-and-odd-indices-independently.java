class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;  
        int[] even = new int[(n + 1) / 2];  
        int[] odd = new int[n / 2];  
        
        for (int i = 0, evenIndex = 0, oddIndex = 0; i < n; i++) {  
            if (i % 2 == 0) {  
                even[evenIndex++] = nums[i];  
            } else {  
                odd[oddIndex++] = nums[i];  
            }  
        }  
        
         
        Arrays.sort(odd);  
        for (int i = 0; i < odd.length / 2; i++) {  
            int temp = odd[i];  
            odd[i] = odd[odd.length - 1 - i];  
            odd[odd.length - 1 - i] = temp;  
        }  

         
        Arrays.sort(even);  
        
        int[] result = new int[n];  
        for (int i = 0, evenIndex = 0, oddIndex = 0; i < n; i++) {  
            if (i % 2 == 0) {  
                result[i] = even[evenIndex++];  
            } else {  
                result[i] = odd[oddIndex++];  
            }  
        }  
        
        return result;  
        
    }
}