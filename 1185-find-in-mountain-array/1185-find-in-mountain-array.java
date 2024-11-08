/**  
 * // This is MountainArray's API interface.  
 * // You should not implement it, or speculate about its implementation  
 * interface MountainArray {  
 *     public int get(int index);  
 *     public int length();  
 * }  
 */  
class Solution {  
    public int findInMountainArray(int target, MountainArray mountainArr) {  
        int n = mountainArr.length();  
         
        int peak = findPeak(mountainArr, n);  
        
        
        int leftResult = binarySearch(mountainArr, 0, peak, target, true);  
        if (leftResult != -1) return leftResult;   
        
          
        return binarySearch(mountainArr, peak + 1, n - 1, target, false);  
    }  
    
    private int findPeak(MountainArray mountainArr, int n) {  
        int left = 0, right = n - 1;  
        while (left < right) {  
            int mid = left + (right - left) / 2;  
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {  
                left = mid + 1;  
            } else {  
                right = mid;  
            }  
        }  
        return left;   
    }  
    
    private int binarySearch(MountainArray mountainArr, int left, int right, int target, boolean isAscending) {  
        while (left <= right) {  
            int mid = left + (right - left) / 2;  
            int midVal = mountainArr.get(mid);  
            
            if (midVal == target) {  
                return mid;   
            }  
            
            if (isAscending) {  
                if (midVal < target) {  
                    left = mid + 1;  
                } else {  
                    right = mid - 1;  
                }  
            } else {  
                if (midVal > target) {  
                    left = mid + 1;  
                } else {  
                    right = mid - 1;  
                }  
            }  
        }  
        return -1;   
    }  
}