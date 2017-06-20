package hop2;

import java.util.Arrays;

public class ss {
	public int smallestpositive(int [] array){
		int s = -1;
		for(int i = 0; i< array.length; i++){
			if(array[i] < 0){
				continue;
			}
			else if(s<0 && array[i]>0 || s>0 && array[i] < s){
				s = array[i];
			}
		}
		return s;
	}
	public static void main (String [] args){
		ss s = new ss();
		int [] array = {-1,-1,1,2,5};
		System.out.println(s.smallestpositive(array));
	}
}
