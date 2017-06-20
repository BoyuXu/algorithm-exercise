package random1000from5;

public class Solution {
	  public int random1000() {
	    // Write your solution here.
	    // you can use RandomFive.random5() for generating
	    // 0 - 4 with equal probability.
	    while(true){
	    	int num = 0;
	    	for(int i = 1; i < 6; i++){
	    		num = 5 * num + (int)(5*Math.random()); 
	    	}
	    	if(num < 3000){
	    		return num % 1000;
	    	}
	    }
	  }
}