class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        Set<Integer> resultSet = new HashSet<>();
        for (int j = 0; j < n; j++) {
            if (nums[j] == key) {
                for (int i = Math.max(0, j - k); i <= Math.min(n - 1, j + k); i++) {
                    resultSet.add(i);
                }
            }
        }
        List<Integer> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);
        return resultList;
    }
}