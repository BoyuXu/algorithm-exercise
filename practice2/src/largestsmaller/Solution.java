package largestsmaller;

public class Solution {
	  public int largestSmaller(TreeNode root, int target) {
	    // Write your solution here.
	    int result = Integer.MIN_VALUE;
	    while(root != null){
	    	if(root.key < target){
	    		root = root.right;
	    		if(Math.abs(root.key - target) < Math.abs(result - target)){
	    			result = root.key;
	    		}
	    	}
	    	if(root.key > target){
	    		root = root.left;
	    	}
	    }
	    return root.key;
	  }
}
