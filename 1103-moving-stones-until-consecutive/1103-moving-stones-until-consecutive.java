class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] stones = {a, b, c};  
        Arrays.sort(stones);  
        int x = stones[0], y = stones[1], z = stones[2];  

        int gap1 = y - x - 1;  
        int gap2 = z - y - 1;  

        int minMoves = 0;  
        if (gap1 == 0 && gap2 == 0) {  
            minMoves = 0;  
        } else if (gap1 <= 1 || gap2 <= 1) {  
            minMoves = 1;  
        } else {  
            minMoves = 2;  
        }  

        int maxMoves = gap1 + gap2; 

      
       return new int[]{minMoves, maxMoves};  
    }
     
}