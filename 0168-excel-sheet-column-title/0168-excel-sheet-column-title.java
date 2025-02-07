class Solution {
    public String convertToTitle(int columnNumber) {
         StringBuilder title = new StringBuilder();  
         while (columnNumber > 0) {  
            columnNumber--;  
            char letter = (char) ('A' + (columnNumber % 26));  
            title.insert(0, letter);  
            columnNumber /= 26;  
        }  
        return title.toString();  

        
    }
}