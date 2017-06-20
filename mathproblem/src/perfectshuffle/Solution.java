package perfectshuffle;

public class Solution {
	  public void shuffle(int[] array) {
	    // Write your solution here.
		  if(array.length <= 1){
			  return;
		  }
		  for(int i = array.length; i >= 1; i--){
			  // math.random 取不到1
			  int s = (int) (i*Math.random());
			  swap(array, s , i);
		  }
	  }
	  private void swap(int [] array, int a,int b){
		  int temp = array[a];
		  array[a] = array[b];
		  array[b] = temp;
	  }
}