class Solution {  
    public int countAsterisks(String s) {  
        int count = 0;         
        boolean inBars = false;   

        for (char c : s.toCharArray()) {  
            if (c == '|') {  
                inBars = !inBars;    
            } else if (c == '*' && !inBars) {  
                count++; 
            }  
        }  

        return count;   
    }  

}