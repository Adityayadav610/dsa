class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> seen = new HashSet<>();  
        int pairs = 0;  
        
        for (String word : words) {  
            String reversed = new StringBuilder(word).reverse().toString();  
            if (seen.contains(reversed)) {  
                pairs++;  
                seen.remove(reversed);  
            } else {  
                seen.add(word);  
            }  
        }  
        
        return pairs;  
        
    }
}