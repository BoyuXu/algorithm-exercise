package sort;

import java.util.Arrays;

public class Solutiontest {
	public static void main(String[] args) {
		int[] a1 = { 1 };
		int[] a2 = { 1, 2 , 3};
		int[] a3 = { 3, 2, 1};
		int[] a4 = { 4, 2, -3, 6, 1 };
		Solution S = new Solution(); 
		S.solve(a1);
		System.out.println(Arrays.toString(a1));
		S.solve(a2);
		System.out.println(Arrays.toString(a2));
		S.solve(a3);
		System.out.println(Arrays.toString(a3));
		S.solve(a4);
		System.out.println(Arrays.toString(a4));
	}
}
