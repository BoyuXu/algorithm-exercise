package postorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> postorder(TreeNode root){
		List<Integer> postorder = new ArrayList<Integer>();
		if (root == null){
			return postorder;
		}
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		stack.offerFirst(root);
		while(!stack.isEmpty()){
			TreeNode cur = stack.pollFirst();
			postorder.add(cur.key);
			if (cur.left!=null){
				stack.offerFirst(cur.left);
			}
			if (cur.right!=null){
				stack.offerFirst(cur.right);
			}
		}
		Collections.reverse(postorder);
		return postorder;
	}
}
