package arrayhopper;

public class Solution {
	 public boolean canJump(int[] array) {
	    // Write your solution here.
	    //base case: M[j] = true
		if(array.length == 1){
			return true;
		}
	    boolean [] canjump = new boolean [array.length];
	    canjump[array.length-1] = true;
	    for(int i = array.length-2; i >= 0; i--){
	    	if(array[i] + i >= array.length - 1){
	    		canjump[i] = true;
	    	}
	    	else{
	    		for(int j =array[i]; j >= 1; j--){
	    			while(canjump[i+j]){
	    				canjump[i] = true;
	    				break;
	    			}
	    		}
	    	}
	    }
	    return canjump[0];
	  }
	}
