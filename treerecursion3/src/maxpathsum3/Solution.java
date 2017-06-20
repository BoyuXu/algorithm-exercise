package maxpathsum3;

public class Solution {
	  public int maxPathSum(TreeNode root) {
	    // Write your solution here.
		  int[] max = new int[]{Integer.MIN_VALUE};
		  helper(root,max);
		  return max[0];
	  }
	  
	  private int helper(TreeNode root, int[] max){
		  //base case
		  if(root == null){
			  return 0;
		  }
		  int left = helper(root.left, max);
		  int right = helper(root.right, max);
		  int compare = Math.max(Math.max(right, left), 0) + root.key;
		  max[0] = Math.max(compare, max[0]);
		  return compare;
	  }
}
