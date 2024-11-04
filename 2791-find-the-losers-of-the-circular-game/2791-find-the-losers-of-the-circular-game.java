class Solution {
    public int[] circularGameLosers(int n, int k) {
        Set<Integer> receivedBall = new HashSet<>();  
        int currentFriend = 0;  
        int i = 1;  

        while (!receivedBall.contains(currentFriend + 1)) {  
            receivedBall.add(currentFriend + 1);
            currentFriend = (currentFriend + i * k) % n;
            i++;   
        }  

         
        List<Integer> losers = new ArrayList<>();  
        for (int friend = 1; friend <= n; friend++) {  
            if (!receivedBall.contains(friend)) {  
                losers.add(friend);  
            }  
        }  

         
        return losers.stream().mapToInt(Integer::valueOf).toArray();  
    }  
        
    
}