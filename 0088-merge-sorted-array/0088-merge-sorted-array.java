class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int mid1=m-1;
       int mid2=n-1;
       int right=m+n-1;
       while(mid2>=0) {
        if(mid1>=0 && nums1[mid1] > nums2[mid2]) {
            nums1[right]=nums1[mid1];
            mid1--;
        } else {
            nums1[right]=nums2[mid2];
            mid2--;
        }
        right--;
       }
    }
}