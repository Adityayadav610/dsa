
import java.util.Hashtable;  
import java.util.HashSet;  
class Solution {
    public int countPoints(String rings) {
        Hashtable<Integer, HashSet<Character>> rodColors = new Hashtable<>();  

        
        for (int i = 0; i < rings.length(); i += 2) {  
            char color = rings.charAt(i);  
            int rod = rings.charAt(i + 1) - '0';  

             
            rodColors.putIfAbsent(rod, new HashSet<>());  
             
            rodColors.get(rod).add(color);  
        }  

        
        int count = 0;  
        for (HashSet<Character> colors : rodColors.values()) {  
            if (colors.contains('R') && colors.contains('G') && colors.contains('B')) {  
                count++;  
            }  
        }  

        return count; 


        
    }
}