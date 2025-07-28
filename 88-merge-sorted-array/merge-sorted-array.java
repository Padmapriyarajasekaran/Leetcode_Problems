class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> n1 = new ArrayList<>();
        for(int i=0;i<m;i++){
            n1.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            n1.add(nums2[i]);
        }
        Collections.sort(n1);
        for(int i=0;i<nums1.length;i++){
            nums1[i]=n1.get(i);
        }
    }
}