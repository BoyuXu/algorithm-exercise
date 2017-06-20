package issymmetric;

public class solution1 {
	public boolean issymmetric1(TreeNode root){
		if(root == null){
			return true;
		}
		return decide(root.left, root.right);
	}
	
	private boolean decide(TreeNode a, TreeNode b){
		if(a == null && b == null){
			return true;
		}
		if(a == null || b == null){
			return false;
		}
		if(a.key != b.key){
			return true;
		}
		return decide(a.left, b.right) && decide(a.right, b.left);
	}
}
