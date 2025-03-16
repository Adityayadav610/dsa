class Solution {
    public String toHex(int num) {
        
          if (num == 0) {  
            return "0";  
        }  

        char[] hexChars = "0123456789abcdef".toCharArray();  
        StringBuilder hexString = new StringBuilder();  

        for (int i = 0; i < 8; i++) {  
            int lastFourBits = num & 0xF;  
            hexString.append(hexChars[lastFourBits]);  
            num >>>= 4;  
            if (num == 0) {  
                break;  
            }  
        }  

        return hexString.reverse().toString();  
    
    }
}