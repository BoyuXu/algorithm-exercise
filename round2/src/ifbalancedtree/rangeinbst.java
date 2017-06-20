package ifbalancedtree;

import java.util.ArrayList;
import java.util.List;

public class rangeinbst {
	public List<Integer> getRange(TreeNode root, int min, int max) {
		// Write your solution here.
		List<Integer> result = new ArrayList<>();
		getminmax(root, min, max, result);
		return result;
	}
	private void getminmax(TreeNode root, int min, int max, List<Integer> result){
		if(root == null){
			return;
		}
		if(root.key > min){
			getminmax(root.left, min, max, result);
		}
		if(root.key < max){
			getminmax(root.right, min, max, result);
		}
		if(root.key <= max && root.key > min){
			result.add(root.key);
		}
	}
}
