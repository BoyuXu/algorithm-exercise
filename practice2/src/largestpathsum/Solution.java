package largestpathsum;

public class Solution {
	  public int maxPathSum(TreeNode root) {
		  // Write your solution here.
		  //base case
		  int [] max = new int[] {Integer.MIN_VALUE};
		  helper(root, max);
		  return max[0];
	  }
	  private int helper(TreeNode root,int[]max){
		  //base case
		  if(root == null){
			  return 0;
		  }
		  //step 1
		  int left = helper(root.left, max);
		  int right = helper(root.right, max);
		  //step 2: current layer
		  if(root.right != null && root.left != null){
			  max[0] = Math.max(max[0], root.key + left + right);
		  //step3: return straight sum
			  return root.key + Math.max(left, right);
		  }
		  return root.left == null? right + root.key : left + root.key;
	  }
}