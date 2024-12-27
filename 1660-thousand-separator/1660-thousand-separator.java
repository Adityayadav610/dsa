class Solution {
    public String thousandSeparator(int n) {
        StringBuilder result = new StringBuilder();  
        boolean isNegative = n < 0;  
        n = Math.abs(n);  
        
        
        String numStr = Integer.toString(n);  
        int length = numStr.length();  
        
        for (int i = 0; i < length; i++) {  
            if (i > 0 && (length - i) % 3 == 0) {  
                result.append(".");  
            }  
            result.append(numStr.charAt(i)); 
        }  
        
        if (isNegative) {  
            result.insert(0, "-");  
        }  
        
        return result.toString();
        
    }
}