package rightshiftbyNcharacter;

public class Solution {
	  public String rightShift(String input, int n) {
	    // Write your solution here.
			  if(input.length() <= 1 ){
				  return input;
			  }
			  char [] array = input.toCharArray();
			  n %= array.length;
			  reverse(array, 0, array.length-1-n);
			  reverse(array, array.length-n, array.length-1);
			  reverse(array, 0, array.length-1);
			  return new String(array);
			  }
		 
		private void reverse(char [] array,int a, int b){
			  while(a <= b){
			    char temp = array[a];
			    array [a] = array[b];
			    array [b] = temp;
			    a++;
			    b--;
			  }
		  }		  
	}
