package storenumberofleftnode;

public class Solution {
public int findtotalleft(TreeNode root){
	//base case, don't have
	if(root == null){
		return 0;
	}
	int lefttotal = findtotalleft(root.left);
	int righttotal = findtotalleft(root.right);
	return lefttotal + righttotal + 1;
}
}
