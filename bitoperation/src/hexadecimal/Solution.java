package hexadecimal;

public class Solution {
	  public String hex(int number) {
	    // Write your solution here.
	    // Assumption number>=0
		String preflix = "0x";
		if (number == 0){
			return preflix+"0";
		}
		// using string builder
		StringBuilder sb = new StringBuilder();
		while(number > 0){
			int rem = number % 16;
			if(rem < 10){
				sb.append((char)('0' + rem));
			}
			else{
				sb.append((char)(rem - 10 + 'A'));
			}
			number >>>= 4;
			}
		return preflix + sb.reverse().toString();
		}
	  }