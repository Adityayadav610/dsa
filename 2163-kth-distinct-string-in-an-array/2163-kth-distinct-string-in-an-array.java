class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        HashMap<String,Integer> hst=new HashMap<>();
        for(String i:arr){
            if(hst.containsKey(i)){
                hst.put(i,hst.get(i)+1);
            }else{
                hst.put(i,1);
            }

        }
        int count = 0;  
        for (String str : arr) {  
            if (hst.get(str) == 1) {  
                count++;  
                
                if (count == k) {  
                    return str;  
                }  
            }  
        } 
         return "";  
        
    }
}