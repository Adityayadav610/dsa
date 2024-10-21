class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int ans1=Integer.MAX_VALUE;


        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j])
                ans1=Math.min(nums1[i],ans1);
            }
            
        }
        if(ans1!=Integer.MAX_VALUE){
            return ans1;
        }

        
        int min1=nums1[0];
        int min2=nums2[0];

        for(int i=1;i<n1;i++){
            if(nums1[i]<min1){
                min1=nums1[i];
            }
        }
        for(int j=1;j<n2;j++){
            if(nums2[j]<min2){
                min2=nums2[j];
            }
        }
        int ans2 = Math.min(min1,min2) * 10 + Math.max(min1,min2); 
        return ans2;     
    }
    
}