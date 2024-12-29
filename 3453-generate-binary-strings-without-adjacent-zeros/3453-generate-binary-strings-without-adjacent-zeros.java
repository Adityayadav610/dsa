class Solution {
    public List<String> validStrings(int n) {
        List<String> result=new ArrayList<>();
        generateString(result,"",n);
        return result;
        
    }
    public void generateString(List<String> result, String current, int remaining){
    if(remaining==0){
        result.add(current);
        return;
    }
    generateString(result,current + '1', remaining - 1);
    if(current.length()==0 || current.charAt(current.length() - 1) != '0'){
        generateString(result,current+'0',remaining-1);
    }
    }
}