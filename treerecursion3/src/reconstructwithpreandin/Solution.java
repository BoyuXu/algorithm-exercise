package reconstructwithpreandin;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	  public TreeNode reconstruct(int[] in, int[] pre) {
	    // Write your solution here.
		  Map<Integer, Integer> inIndex = indexMap(in);
		  return helper(pre, inIndex,0,in.length-1,0,in.length-1);
	  }
	  private Map<Integer, Integer> indexMap(int [] in){
		  Map<Integer, Integer> map = new HashMap<>();
		  for(int i = 0; i < in.length; i++){
			  map.put(in[i],i);
		  }
		  return map;
	  }
	  private TreeNode helper(int [] pre, Map<Integer, Integer> inIndex, int inleft, int inright, int preleft, int preright){
		  if(inleft > inright){
			  return null;
		  }
		  TreeNode root = new TreeNode(pre[preleft]);
		  int inmid = inIndex.get(root.key);
		  root.left = helper(pre, inIndex, inleft, inmid-1, preleft+1, preleft - inleft + inmid);
		  root.right = helper(pre, inIndex, inmid + 1, inright, preright - inright + inmid + 1, preright);
		  return root;
	  }
}