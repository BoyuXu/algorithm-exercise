package ifbalancedtree;

import Treetraversal.TreeNode;


public class Solution {
	public boolean isBalanced(TreeNode root) {
		if(checkHeight(root) == -1){
			return false;
		}
		return true;
	}
	private int checkHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		int leftdiff = checkHeight(root.left);
		int rightdiff = checkHeight(root.right);
		int height = Math.abs(leftdiff - rightdiff);
		if(height > 1){
			return -1;
		}else {
			return Math.max(leftdiff, rightdiff) + 1;
		}
	}
	 public static void main (String [] args){
		 Solution s = new Solution();
		 TreeNode n1 = new TreeNode(1);
		 TreeNode n2 = new TreeNode(2);
		 TreeNode n3 = new TreeNode(3);
		 TreeNode n4 = new TreeNode(4);
		 n1.left = n2;
		 n1.right = n3;
		 n2.left = n4;
		 System.out.println(s.isBalanced(n1));
	 }
}
