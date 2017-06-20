package missoneelement;

import java.util.HashSet;

public class Solution {
	  public int missing(int[] array) {
		    // Write your solution here.
		    HashSet<Integer> set = new HashSet<Integer>();
		    for (int number : array){
		    	set.add(number);
		    }
		    for(int i=0; i<array.length; i++){
		    	if (!set.contains(i)){
		    		return i; 
		    	}
		    }
		    //前面的都没有，只能是最后一个
		    return array.length;
	 }
}