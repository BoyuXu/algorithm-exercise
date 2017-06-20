package hop2;

public class Solution {
	  public int minJump(int[] array) {
	    // Write your solution here.
		  if(array.length == 1){
				return 0;
		  }
		  int [] number = new int[array.length];
		  number[array.length-1] = 0;
		  for(int i = array.length - 2; i >= 0; i--){
			  int a = array[i];
			  if (a==0){
				  number[i] = -1;
			  }
			  if (a!=0){
				  int [] record = new int [a];
				  for(int j = array [i]; j > 0; j--){
					  if(i+j>= array.length-1){
					  number[i] = 1;
					  }
				  else{
					  record[j-1] = number[i+j];
				  }
			  }
			  number[i] = 1 + min(record);
			  }
		  }
		  return number[0];
	  }
	  private int min(int [] record){
		  	int s = -2;
			for(int i = record.length-1; i>=0; i--){
				if(record[i] < 0){
					continue;
				}
				else if(s<0 && record[i]>=0 || s>=0 && record[i] < s){
					s = record[i];
				}
		  }
		return s;
	  }
		  
	  public static void main (String [] args){
		  Solution s = new Solution();
		  int [] a = {2,1,0,3,1};
		  System.out.println(s.minJump(a));
	  }
	}
