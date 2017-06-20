package rainbowsort;
import java.util.Arrays;
public class Solution {
     public int[] rainbowsort(int [] array){
          if (array == null||array.length==0){
        	  return array;
          }
          int neg = 0;
          int zero = 0;
          int one = array.length-1;
          while(zero<=one){
        	  if(array[zero] == -1){
        		  swap(array,zero++,neg++);
        		  }
        	  else if(array[zero] == 0){
        		  zero++;
        		  }
        	  else{
        	  swap(array,zero,one--);
              }
          }	  
       return array;
     }
     public void swap(int[]array,int a,int b){
    	 int temp = array[a];
    	 array[a] = array[b];
    	 array[b] = temp;
     }
}
