package chceckifcousin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public boolean checkifcousin(TreeNode root, TreeNode one, TreeNode two){
		if(root == null || one == null || two == null){
			return false;
		}
		Queue <TreeNode> queue = new LinkedList<>(); 
		TreeNode target1 = null;
		TreeNode target2 = null;
		queue.offer(root);
		while(queue != null){
			int size = queue.size();
			for(int i = 0; i < size; i++){
				TreeNode cur = queue.poll();
				if(cur.left != null){
					if(cur.left == one){
						target1 = cur;
					}
					else if(cur.left == two){
						target2 = cur;
					}
					queue.offer(cur.left);
				}
				if(cur.right != null){
					if(cur.right == one){
						target1 = cur;
					}
					else if(cur.right == two){
						target2 = cur;
					}
					queue.offer(cur.right);
				}
			}
			if(target1 != null && target2 != null && target1 != target2){
				return true;
			}
			else{
				target1 = null;
				target2 = null;
			}
		}
		return false;
	}
	public static void main (String [] args){
		Solution s = new Solution();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(1);
		TreeNode t4 = new TreeNode(1);
		TreeNode t5 = new TreeNode(1);
		TreeNode t6 = new TreeNode(1);
		TreeNode t7 = new TreeNode(1);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		System.out.println(s.checkifcousin(t1, t5, t6));
	}
}
