package issearchtree;

public class Solution {
	  public boolean isBST(TreeNode root) {
	    // Write your solution here.
		     return decide( root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	  }
	  private boolean decide(TreeNode root, int min, int max){
		  if (root == null){
		     return true;
	    }
	    if (root.key < min || root.key > max){
	       return false;
	  }
	  else {
	       return decide(root.left, min, root.key-1) && decide( root.right , max, root.key + 1);
	  }
	  }
	}