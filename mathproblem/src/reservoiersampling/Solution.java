package reservoiersampling;

public class Solution {
	  public Solution() {
	    // Write your constructor code here if necessary.
		  this.count = 0;
		  this.sample = null;
	  }
	  private int count;
	  private Integer sample;
	  public void read(int value) {
	    // Write your implementation here.
		  count++;
		  int a = (int)(Math.random()*count);
		  if(a == 0){
			  sample = value;
		  }
	  }
	  
	  public Integer sample() {
	    // Write your implementation here.
	    return sample;
	  }
	}