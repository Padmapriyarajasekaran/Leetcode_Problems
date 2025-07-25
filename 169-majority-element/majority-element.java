class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            int count = countMap.getOrDefault(num, 0) + 1;
            if (count > n / 2) {
                return num;
            }
            countMap.put(num, count);
        }

        return -1; // this line is never reached since majority always exists
    }
}
