package closestnumber;

public class Solution {
	  public int closest(TreeNode root, int target) {
	    // Write your solution here.
		  int result = root.key;
		  while(root != null){	  
			  if(root.key == target){
				  return root.key;
			  }
			  else {
			    if(Math.abs(root.key - target) < Math.abs(result - target)){
				    result = root.key;
			    }
			    if(root.key < target){
				    root = root.right;
			    }
			    else{
				  root = root.left;
			    }
		    }
		  }
		  return result;
	  }
}
