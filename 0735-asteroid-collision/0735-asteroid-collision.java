class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();  

        for (int asteroid : asteroids) {  
            boolean exploded = false;  
  
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {  
                int top = stack.pop();  
                
                if (top == -asteroid) {  
                    
                    exploded = true;  
                    break;  
                } else if (top > -asteroid) {  
                     
                    stack.push(top); 
                    exploded = true;  
                    break;  
                } else {  
                      
                    
                }  
            }  
             
            if (!exploded) {  
                stack.push(asteroid);  
            }  
        }  

        
        int[] result = new int[stack.size()];  
        for (int i = result.length - 1; i >= 0; i--) {  
            result[i] = stack.pop();  
        }  

        return result;  
    }  
        
    
}