class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String[] words = s.trim().split("\\s+");
        for(String word: words){
            stack.push(word);
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
            if(!stack.isEmpty()){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}