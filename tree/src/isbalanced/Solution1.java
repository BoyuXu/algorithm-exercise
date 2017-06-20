package isbalanced;

public class Solution1 {
	public boolean isbalancedtree1(TreeNode root){
		if(root == null){
			return true;
		}
		return height(root) != -1;
	}
	private int height(TreeNode root){
		if(root == null){
			return 0;
		}
		int left = height(root.left);
		if(left == -1){
			return -1;
		}
		int right = height(root.right);
		if(right == -1){
			return -1;
		}
		if(Math.abs(left - right) > 1){
			return -1;
		}
		return Math.max(left, right) + 1;
	}
	public static void main (String [] args){
		Solution1 s = new Solution1();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		TreeNode t8 = new TreeNode(8);
		TreeNode t9 = new TreeNode(9);
		TreeNode t10 = new TreeNode(10);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t5.left = t8;
		t5.right = t9;
		t9.right = t10;
		System.out.println(s.isbalancedtree1(t1));
	}
}
