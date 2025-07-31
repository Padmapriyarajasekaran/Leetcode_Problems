class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length -1];
        int minlength = Math.min(a.length(),b.length());
        int i=0;
        while(i<minlength && a.charAt(i)==b.charAt(i)){
            i++;
        }
        return a.substring(0,i);
    }
}