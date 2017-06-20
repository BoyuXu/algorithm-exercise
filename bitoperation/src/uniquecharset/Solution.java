package uniquecharset;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	  public boolean allUnique(String word) {
	    // write your solution here
		 if (word == null){
			 return true;
		 }
		 char [] array = word.toCharArray();
		 Set <Character> c = new HashSet <Character>();
		 for (int i = 0 ; i < array.length; i++){
			 if(c.add(array[i])){
				 continue;
			 }
			 else{
				 return false;
			 }
		 }
		 return true;
	  }
	}
