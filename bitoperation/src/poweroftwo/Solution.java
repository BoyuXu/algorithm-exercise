package poweroftwo;

public class Solution {
	public boolean isPowerOfTwo(int number) {
	    // Write your solution here.
			if(number == 1){
				return true;
			}
			if(number <= 0){
				return false;
			}
		    if(number%2 == 0){
		    	return isPowerOfTwo(number/2);
		    }
		    return false;
		  }
		}
