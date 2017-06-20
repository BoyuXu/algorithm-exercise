package largeassrevise;

public class Solution {
public int longest(int [] array){
	if(array.length == 0){
		return 0;
	}
	int result = 1;
	int cur = 1;
	for(int i = 1; i < array.length; i++){
		if(array[i] > array[i-1]){
			cur++;
			result = Math.max(result, cur);
		}
		else{
			cur = 1;
		}
	}
	return result;
}
}
