package treerecursion3;

public class Solution {
	  public int maxPathSum(TreeNode root) {
		  // Write your solution here.
		  int[] max = new int[]{Integer.MIN_VALUE};
		  helper(root,max);
		  return max[0];
	  }
	  
	  private int helper(TreeNode root, int [] max){
		  //base case
		  if(root == null){
			  return 0;
		  }
		  int left = helper(root.left,max);
		  int right = helper(root.right,max);
		  left = left > 0 ? left : 0;
		  right = right > 0 ? right : 0;
		  max[0] = Math.max(max[0], right + left + root.key);
		  return Math.max(right, left) + root.key;
	  }
}
