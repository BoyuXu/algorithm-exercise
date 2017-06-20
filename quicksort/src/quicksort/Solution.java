package quicksort;

public class Solution {
	  public int[] quickSort(int[] array) {
		    // Write your solution here
		  if (array == null) {
			  return array;
		  }
			  Sort1(array, 0, array.length-1);
			  return array;
		  }  
		  
		  //method put target to the right
		  private void Sort1(int [] array, int left, int right){
			  int p= Sort ( array,  left,  right); 
			  Sort ( array, left, p - 1);
			  Sort ( array, p + 1, right);
		  }
		  
		  private int Sort( int [] array, int left, int right){
			  int targetindex = targetindex( left,  right);
			  int target = array[targetindex];
			  swap(array, target, right);
			  // move i(left), j(right)
			  int i=left;
			  int j=right-1;
			  while(i<=j){
				  if (array[i]< target){
					  i++;
				  }
					  else if (array[j]>target){
						  j--;  
					  }
					  else{
						  swap(array,array[i],array[j]);
						  i++;
						  j--;
					  }
			  }
			  swap(array, i , right);
			  return i ;
		  }
		  	  
		  //method get the index of the target
		  private int targetindex(int left, int right ){
			 return left + (int)( Math.random() * (right - left +1));			  		  
		  }
		  
		  //swap method
		  private void swap(int[]array, int left,  int right){
			  int temp = array[left];
			  array[right] = array[right];
			  array [right] = temp;			  
		  }  
}
