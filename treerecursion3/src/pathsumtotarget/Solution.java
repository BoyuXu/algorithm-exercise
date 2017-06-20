package pathsumtotarget;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	  public boolean exist(TreeNode root, int target) {
	    // Write your solution here.
		  if(root == null){
			  return false;
		  }
		  List<TreeNode> path = new ArrayList<TreeNode>();
		  return helper(root, path, target);
	  }
	  
	  private boolean helper(TreeNode root, List<TreeNode> path, int target){
		  path.add(root);
		  int temp = 0;
		  for(int i = path.size(); i >= 0 ; i--){
			  temp = temp + path.get(i).key;
			  if(temp == target){
				  return true;
			  }
		  }
		  if(root.left != null && helper(root.left, path, target)){
			  return true;
		  }
		  if(root.right != null && helper(root.right, path, target)){
			  return true;
		  }
		  path.remove(path.size() - 1);
		  return false;
	  }
}
