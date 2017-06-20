package DP;

public class arrayhop {
	 public boolean canJump(int[] array) {
		    // Write your solution here.
		    //base case: M[j] = true
		if(array.length == 1) {
			return true;
		}
		boolean [] canjump = new boolean[array.length];
		canjump[array.length - 1] = true;
		for(int i = array.length - 2; i >= 0; i--) {
			if(array[i] + i >= array.length - 1) {
				canjump[i] = true;
			}
			for(int j = array.length - 2; j > i; j--) {
				if(array[i] + i >= j && canjump[j] == true) {
					canjump[i] = true;
				}
			}
		}
		return canjump[0];
	 }
	 public static void main(String [] args){
		 arrayhop s = new arrayhop();
		 int [] array = {1,1,2,0,0,1};
		 System.out.println(s.canJump(array));
	 }
}
