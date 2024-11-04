class Solution {
    public int countSymmetricIntegers(int low, int high) {
         int count = 0;  

          
        for (int num = low; num <= high; num++) {  
            
            String strNum = Integer.toString(num);  
            int length = strNum.length();  

             
            if (length % 2 == 0) {  
                int mid = length / 2;  
                int sum1 = 0;  
                int sum2 = 0;  

                
                for (int i = 0; i < mid; i++) {  
                    sum1 += strNum.charAt(i) - '0'; 
                    sum2 += strNum.charAt(i + mid) - '0';  
                }  

               
                if (sum1 == sum2) {  
                    count++;  
                }  
            }  
        }  

        return count;  
      
        
    }
}