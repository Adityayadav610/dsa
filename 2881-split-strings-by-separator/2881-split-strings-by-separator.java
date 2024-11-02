class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();  

        for (String word : words) {  
            String[] parts = word.split("\\Q" +separator+ "\\E");  
            for (String part : parts) {  
                if (!part.isEmpty()) {  
                    result.add(part);  
                }  
            }  
        }  

        return result;  
        
    }
}