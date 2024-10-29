class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
       
    Arrays.sort(apple);  
    Arrays.sort(capacity);  
    int totalApples =0;  
    for (int a : apple) {  
    totalApples += a;  
    }  
    int totalCapacity =0;  
    int boxCount =0;  
    for (int i = capacity.length -1; i >=0; i--) {  
    totalCapacity += capacity[i];  
    boxCount++;  
    if (totalCapacity >= totalApples) {  
    return boxCount;  
    }  
    }  
     return -1;
        
    }
}