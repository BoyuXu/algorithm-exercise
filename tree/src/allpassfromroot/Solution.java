package allpassfromroot;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if (root == null) {
	            return result;
	        }
	        Deque<TreeNode> deque = new LinkedList<>();
	        deque.offerFirst(root);
	        int layer = 0;
	        while (!deque.isEmpty()) {
	            int size = deque.size();
	            List<Integer> list = new ArrayList<>();
	            // even level
	            for (int i = 0; i < size; i++) {
	                if (layer == 0) {
	                    TreeNode cur = deque.poll();
	                    if(cur != null) {
	                    	list.add(cur.key);
	                    	if (cur.right != null) {
	                        	deque.offerFirst(cur.right);
	                    	}
	                    	if (cur.left != null) {
	                        	deque.offerFirst(cur.left);
	                    	}
	                    }
	                }
	                else {
	                    TreeNode cur = deque.poll();
	                    if(cur != null) {
	                    	list.add(cur.key);
	                    }
	                    if(cur.right != null) {
	                        deque.offerLast(cur.right);
	                    }
	                    if (cur.left != null) {
	                        deque.offerLast(cur.left);
	                    }
	                }
	            }
	            layer = 1 - layer;
	            result.add(new ArrayList(list));
	        }
	        return result;
	    }
	    
	    public static void main(String [] args) {
	    	Solution s = new Solution();
	    	TreeNode r1 = new TreeNode(3);
	    	TreeNode r2 = new TreeNode(9);
	    	TreeNode r3 = new TreeNode(20);
	    	TreeNode r4 = new TreeNode(15);
	    	TreeNode r5 = new TreeNode(7);
	    	r1.left = r2;
	    	r1.right = r3;
	    	r3.left = r4;
	    	r3.right = r5;
	    	System.out.println(s.zigzagLevelOrder(r1));
	    }
	}


