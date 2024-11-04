class Solution {
    public int minMaxDifference(int num) {
         String numStr = String.valueOf(num); 
        int maxValue = num;   
        int minValue = num;  
        
         
        for (char d1 : numStr.toCharArray()) {  
           
            for (char d2 = '0'; d2 <= '9'; d2++) {  
                if (d1 == d2) continue; 
                
            
                String newNumStr = numStr.replace(d1, d2);  
                
              
                int newNum = Integer.parseInt(newNumStr);  
                
              
                maxValue = Math.max(maxValue, newNum);  
                minValue = Math.min(minValue, newNum);  
            }  
        }  
        
        
        return maxValue - minValue;  
    }  
        
    
}