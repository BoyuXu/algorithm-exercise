package randomdenote5random7;

public class Solution {
	  public int random7() {
	    // write your solution here
	    // you can use RandomFive.random5() for generating
	    // 0 - 4 with equal probability.
		while(true){
			int i = (int)(5*Math.random());
			int j = (int)(5*Math.random());
			int random = i + j;
			if(random < 21){
				return random%7;
			}
		}
	  }
}