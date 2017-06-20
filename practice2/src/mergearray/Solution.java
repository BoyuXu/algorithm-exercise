package mergearray;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	  public int[] merge(int[][] arrayOfArrays) {
	    // Write your solution here.
		  PriorityQueue<Entry> minheap = new PriorityQueue<Entry>(11,new Mycomparator());
		  int length = 0;
		  for(int i = 0; i < arrayOfArrays.length; i++){
			  int [] array = arrayOfArrays[i];
			  length = length + array.length;
			  if(array.length != 0){
				  //minheap中放入每个array的最小值
				  minheap.offer(new Entry(i,0,array[0]));
			  }
		  }
		  int [] result = new int [length];
		  int cur = 0;
		  while(!minheap.isEmpty()){
			  Entry temp = minheap.poll();
			  result[cur++] = temp.value;
			  if(temp.y + 1 < arrayOfArrays[temp.x].length){
				  temp.y++;
				  temp.value = arrayOfArrays[temp.x][temp.y];
			  }
			  minheap.offer(temp);
		  }
		  return result;
	  }
	  
	  static class Mycomparator implements Comparator<Entry>{
		  @Override
		  public int compare(Entry e1, Entry e2){
			  if(e1.value == e2.value){
				  return 0;
			  }
			  return e1.value < e2.value? -1 : 1;
		  }
	  }
	  
	  static class Entry{
		  //row number
		  int x;
		  //column number
		  int y;
		  int value;
		  Entry(int x, int y, int value){
			  this.x = x;
			  this.y = y;
			  this.value = value;
		  }
	  }
}