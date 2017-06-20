package preorder;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> preorder (TreeNode root){
		List<Integer> preorder = new ArrayList();
		if (root == null){
			return preorder;
		}
		Deque<TreeNode> stack = new LinkedList();
		stack.offerFirst(root);
		while(!stack.isEmpty()){
			TreeNode cur = stack.pollFirst();
			if(cur.right!=null){
				stack.offerFirst(cur.right);
			}
			else if(cur.left!=null){
				stack.offerFirst(cur.left);
			}
			preorder.add(cur.key);
		}
		return preorder;
	}
}
