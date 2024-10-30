class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int count=0;
        if(n<3){
            return 0;
        }
        for(int i=0;i<n-2;i++){
            if(colors[i]==colors[i+2] && colors[i]!=colors[i+1]){
                count++;
            }
            
        }
        if(colors[0]==colors[n-2] && colors[0]!=colors[n-1]){
            count++;
        }
        if(colors[0]!=colors[1] && colors[1]==colors[n-1]){
            count++;
        }
        return count;
    

        
    }
}