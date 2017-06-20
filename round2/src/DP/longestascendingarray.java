package DP;

public class longestascendingarray {
	public int longest(int [] array){
		if(array == null || array.length == 0){
			return 0;
		}
		int [] num = new int[array.length];
		num[0] = 1;
		int result = 1;
		for(int i = 1; i < array.length; i++) {
			if(array[i] > array[i-1]){
				num[i] = Math.max(num[i-1] + 1, 1);
				result = Math.max(result, num[i]);
			} else{
				num[i] = 1;
			}
		}
		return result;
	}
	
	public static void main (String [] args){
		longestascendingarray s = new longestascendingarray();
		int [] array = {1,2,3,2,3,4,5,1};
		System.out.print(s.longest(array));
	}
}
