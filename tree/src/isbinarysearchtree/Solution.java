package isbinarysearchtree;

public class Solution {
	public boolean isbinarysearchtree(TreeNode root){
		return decide(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	private boolean decide(TreeNode root, int min, int max){
		if(root == null){
			return true;
		}
		if(root.key <= min || root.key >= max){
			return false;
		}
		return decide(root.left, min, root.key) && decide(root.right, root.key, max);
	}
}
