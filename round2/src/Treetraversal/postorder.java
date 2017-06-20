package Treetraversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class postorder {
	 public List<Integer> postOrder(TreeNode root) {
		 List<Integer> result = new ArrayList<>();
		 if(root == null){
			 return result;
		 }
		 Deque<TreeNode> stack = new LinkedList<>();
		 stack.offerFirst(root);
		 TreeNode pre = null;
		 while (!stack.isEmpty()) {
			TreeNode cur = stack.peekFirst();
			if (pre == null || cur == pre.left || cur == pre.right) {
				if(cur.left != null){
					stack.offerFirst(cur.left);
				}else if(cur.right != null){
					stack.offerFirst(cur.right);
				}else {
					stack.pollFirst();
					result.add(cur.key);
				}
			}
			//from leftsubtree
			else if (pre == cur.right || pre == cur.left && cur.right == null){
					stack.pollFirst();
					result.add(cur.key);
			}
			//from rightsubtree
			else {
				stack.offerFirst(cur.right);
			}
			pre = cur;
		 }
		 return result;
	 }
	 
	 public static void main (String [] args){
		 postorder s = new postorder();
		 TreeNode n1 = new TreeNode(1);
		 TreeNode n2 = new TreeNode(2);
		 TreeNode n3 = new TreeNode(3);
		 TreeNode n4 = new TreeNode(4);
		 n1.left = n2;
		 n1.right = n3;
		 n2.left = n4;
		 System.out.println(s.postOrder(n1));
	 }
}
