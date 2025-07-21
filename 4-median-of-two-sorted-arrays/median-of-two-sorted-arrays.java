import java.util.*;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int num : nums1) arr.add(num);
        for (int num : nums2) arr.add(num);

        Collections.sort(arr);

        int n = arr.size();
        if (n % 2 != 0) {
            return arr.get(n / 2);
        } else {
            int mid1 = arr.get(n / 2 - 1);
            int mid2 = arr.get(n / 2);
            return (mid1 + mid2) / 2.0;
        }
    }
}
