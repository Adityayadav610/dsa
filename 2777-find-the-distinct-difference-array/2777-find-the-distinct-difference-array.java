class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            HashSet<Integer> pref=new HashSet<>();
            for(int j=0;j<=i;j++){
                pref.add(nums[j]);
            }
            HashSet<Integer> suff=new HashSet<>();
            for(int j=i+1;j<n;j++){
                suff.add(nums[j]);
            }
            arr[i]=pref.size()-suff.size();
        }

        return arr;
    }
}