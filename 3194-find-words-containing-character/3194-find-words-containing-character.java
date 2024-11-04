class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer> lst=new  ArrayList<>();
        for(int i=0;i<n;i++){
            if(words[i].indexOf(x) !=-1){
                lst.add(i);
            }
        }
        
        return lst;
      
        
    }
}