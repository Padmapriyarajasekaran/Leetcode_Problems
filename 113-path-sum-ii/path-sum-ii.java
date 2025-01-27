/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void helper(TreeNode root,List<Integer> currentPath,List<List<Integer>> ans,int targetSum){
      if(root==null) return;
      currentPath.add(root.val);//adding the nodes of the binary tree to the list
      if(root.left==null && root.right==null && root.val==targetSum){
        ans.add(new ArrayList<>(currentPath));//makes a deep copy of the list currentPath ie creates a new List having elements same as the currentPath
      }
        else{
            helper(root.left,currentPath,ans,targetSum-root.val);
            helper(root.right,currentPath,ans,targetSum-root.val);
        }
        currentPath.remove(currentPath.size()-1);//removing the last elemnt using backtracking
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> currentPath=new  ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,currentPath,ans,targetSum);
        return ans;
    }
}