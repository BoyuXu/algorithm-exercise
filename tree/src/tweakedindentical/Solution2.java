package tweakedindentical;

public class Solution2 {
	public boolean tweakedsame(TreeNode a, TreeNode b){
		if(a == null && b == null){
			return true;
		}
		if(a == null || b == null){
			return false;
		}
		else if(a.key != b.key){
			return false;
		}
		return (tweakedsame(a.left, b.right) && tweakedsame(a.right, b.left)) || (tweakedsame(a.right, b.right) && tweakedsame(a.left, b.left)); 
	}
}
