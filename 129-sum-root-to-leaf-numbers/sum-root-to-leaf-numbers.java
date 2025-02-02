
class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int sum) {
        // Base case: if the node is null, it contributes 0 to the sum
        if (root == null) {
            return 0;
        }

        // Update the current sum by appending the node's value
        sum = sum * 10 + root.val;

        // If the node is a leaf, return the current sum
        if (root.left == null && root.right == null) {
            return sum;
        }

        // Recurse for left and right children and return their sum
        return helper(root.left, sum) + helper(root.right, sum);
    }
}