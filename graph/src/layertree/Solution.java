package layertree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	  public List<List<Integer>> layerByLayer(TreeNode root) {
		    // Write your solution here.
		  List <List<Integer>> list = new ArrayList <List<Integer>>(); 
		  if(root == null){
			   return list;
		   }
		  Queue <TreeNode> queue = new LinkedList<TreeNode>();
		  queue.offer(root);
		  while(!queue.isEmpty()){
			  //每层创建一个子List，并且统计当层的个数
			  List<Integer> a = new ArrayList <Integer>();
			  int size = queue.size();
			  for(int i=0; i<size; i++){
				  TreeNode cur = queue.poll();
				  a.add(cur.key);
				  if(cur.left != null){
					  queue.offer(cur.left);
				  }
				  if(cur.right != null){
					  queue.offer(cur.right);
				  }
			  }
			  list.add(a);
		  }
		  return list;
		  }
		}
