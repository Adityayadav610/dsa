class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> al = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                al.add(new int[] {nums1[i][0] , nums1[i][1] + nums2[j][1]});
                i++;j++;
            }else if(nums1[i][0] < nums2[j][0]){
                al.add(nums1[i]);
                i++;
            }else{
                al.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length){
            al.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            al.add(nums2[j]);
            j++;
        }

        int[][]res = new int[al.size()][2];
        i=0;
        for(int[] a : al)
            res[i++] = a;

        return res;
    }
        
    
}