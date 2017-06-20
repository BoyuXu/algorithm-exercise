package stringencoding;

public class Solution {
	public String decompress(String input) {
		// Write your solution here.
		if(input.isEmpty()){
			return input;
		}
		char [] array = input.toCharArray();
		return decodelong(array,decodeshort(array));
	}
	private int decodeshort(char [] array){
		int slow = 0;
		for(int i = 0; i < array.length; i += 2){
			int num = array[i+1] - '0';
			if(num >= 0 && num <= 2){
				for(int j = 0; j < num; j++){
					array[slow++] = array[i];
				}
			}else{
				//don't handle longer situation
				array[slow++] = array[i];
				array[slow++] = array[i+1];
			}
		}
		return slow;
	}
	private String decodelong(char [] array, int length){
		int newlength = length;
		for(int i = 0; i < newlength; i++){
			int num = array[i] - '0';
			if(num > 2 && num <= 9){
				newlength += num - 2;
			}
		}
		char [] result = new char[newlength];
		int end = newlength - 1;
		for(int i = length - 1; i >= 0; i--){
			int num = array[i] - '0';
			if(num > 2 && num <= 9){
				i--;
				for(int j = 0; j < num; j++){
					result[end--] = array[i]; 
				}
			}else{
				result[end--] = array[i];
			}
		}
		return new String(result);
	}
	
	public static void main (String [] args){
		Solution s = new Solution();
		String input = "a0b1c4d1";
		System.out.println(s.decompress(input));
	}
}
