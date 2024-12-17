class Solution {
    public String reformatDate(String date) {
        HashMap<String, String> monthMap = new HashMap<>();  
        monthMap.put("Jan", "01");  
        monthMap.put("Feb", "02");  
        monthMap.put("Mar", "03");  
        monthMap.put("Apr", "04");  
        monthMap.put("May", "05");  
        monthMap.put("Jun", "06");  
        monthMap.put("Jul", "07");  
        monthMap.put("Aug", "08");  
        monthMap.put("Sep", "09");  
        monthMap.put("Oct", "10");  
        monthMap.put("Nov", "11");  
        monthMap.put("Dec", "12");  
        
         
        String[] parts = date.split(" ");  
        String dayStr = parts[0];   
        String monthStr = parts[1]; 
        String yearStr = parts[2]; 

         
        String day = dayStr.replaceAll("[^0-9]", ""); 
        if (day.length() < 2) {  
            day = "0" + day;  
        }  

         
        String month = monthMap.get(monthStr);  
 
        String year = yearStr;  
 
        return year + "-" + month + "-" + day;  
    }  
}  
        
   