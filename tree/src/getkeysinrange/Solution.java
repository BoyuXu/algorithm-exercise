package getkeysinrange;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	  public List<Integer> getRange(TreeNode root, int min, int max) {
		    // Write your solution here.
		    List<Integer> result = new ArrayList<Integer>();
		    getmaxmin(root, min, max, result);
		    return result;
		  }
	  private void getmaxmin(TreeNode root, int min, int max,List<Integer> result){
		  //corner case
		  if(root == null){
			  return;
		  }
		  if(root.key > min){
			  getmaxmin(root.left, min, max, result);
		  }
		  if(root.key <= max && root.key >= min){
			  result.add(root.key);
		  }
		  if(root.key < max){
			  getmaxmin(root.right, min ,max, result);
		  }
	  }
}