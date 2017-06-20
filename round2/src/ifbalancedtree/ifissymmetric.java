package ifbalancedtree;

public class ifissymmetric {
	public boolean isSymmetric(TreeNode root){
		if(root == null){
			return true;
		}
		return decide(root.left, root.right);
	}
	private boolean decide(TreeNode left, TreeNode right){
		if(left == null && right == null){
			return true;
		}else if(left == null || right == null){
			return false;
		}else if(left.key != right.key){
			return false;
		}
		return decide(left.left, right.right) && decide(left.right, right.left);
	}
}
