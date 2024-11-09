class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            //char ransom=ransomNote.charAt(i);
            char maga=magazine.charAt(i);
            if(!map.containsKey(maga)){
               map.put(maga,1);
            }
            else{
                map.put(maga,map.get(maga)+1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            char ransom=ransomNote.charAt(i);
            if(map.containsKey(ransom) && map.get(ransom)>0){
                map.put(ransom,map.get(ransom)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}