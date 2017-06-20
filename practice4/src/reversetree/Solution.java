package reversetree;

public class Solution {
	  public TreeNode reverse(TreeNode root) {
	    // Write your solution here.
		  if(root == null || root.left == null){
			  return root;
		  }
		  TreeNode newNode = reverse(root.left);
		  root.left.left = root;
		  root.left.right = root.right;
		  root.left = null;
		  root.right = null;
		  return newNode;
	  }
}
