class Solution {
    public int countSegments(String s) {
       int count=0;
       for(int i=0;i<s.length();i++){
        //+-System.out.print(s.length());
        if(s.charAt(i)!=' ' && ( i==0 ||s.charAt(i-1)==' ')){
            count++;
        }
       }
       return count;           
       
    }
}