package differentbits;

public class Solution {
	  public int diffBits(int a, int b) {
	    // Write your solution here.
		  a^=b;
		  int count = 0;
		  while(a != 0){
			  count += a & 1;
			  a >>>=1;
		  }
		  return count;
	  }
	}
