package longestcosecutive1;

public class Solution {
	public int largest(int [] array){
		if(array.length == 0){
			return 0;
		}
		int result = 0;
		int compare = 0;
		for(int i = 0; i < array.length; i++){
			int cur = array[i];
			if(cur == 1){
				compare++;
				result = Math.max(result, compare);
			}
			else{
				compare = 0;
			}
		}
		return result;
	}
	public static void main (String [] args){
		Solution s = new Solution();
		int [] array = {0,1,0,0,0,1,1};
		System.out.print(s.largest(array));
	}
}
