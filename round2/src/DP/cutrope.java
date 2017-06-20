package DP;

import java.lang.reflect.Array;

public class cutrope {
	public int maxProduct(int length) {
		int [] array = new int[length + 1];
		array[0] = 0;
		array[1] = 1;
		array[2] = 1;
		if(length == 2){
			return 1;
		}
		for(int i = 3; i < array.length; i++) {
			for(int j = 1; j < i; j++) {
				array[i] = Math.max(array[i],Math.max(array[j], j)*(i-j));
			}
		}
		return array[length];
	}
	public static void main (String [] args){
		cutrope cutrope = new cutrope();
		System.out.print(cutrope.maxProduct(12));
	}
}
