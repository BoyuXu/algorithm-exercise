package put0end;

public class Solution {
	  public int[] moveZero(int[] array) {
		    // Write your solution here.
		   int i = 0;
		   int j = array.length-1;
		   while(i<=j){
		     if(array[i] == 0){
		       swap(array, i, j--);
		     }
		     else{
		       i++;
		     }
		   }
		   return array;
		  } 
		  private void swap(int[] array, int i, int j){
		    int temp = array[i];
		    array[i] = array[j];
		    array[j] = temp;
		  }
		}