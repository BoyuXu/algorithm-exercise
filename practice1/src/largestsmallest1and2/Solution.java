package largestsmallest1and2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	// Write your solution here.
    // The first element is the largest number,
    // the second element is the second largest n
	
	public int [] LargestAndSecond(int [] array){
		Element[] helper = convert(array);
		int largelength = array.length;
		while(largelength > 1){
			compareAndSwap(helper,largelength);
			largelength = (largelength + 1)/2;
		}
		return new int[] {helper[0].value, largest(helper[0].comparedvalue)};
	}
	
	private Element[] convert(int [] array){
		Element [] helper = new Element[array.length];
		for(int i = 0; i < array.length;i++){
			helper[i] = new Element(array[i]);
		}
		return helper;
	}
	
	private void compareAndSwap(Element [] helper, int largerestlength){
		for(int i = 0; i < largerestlength/2; i++){
			if(helper[i].value < helper[largerestlength-1-i].value){
				swap(helper, i , largerestlength-1-i);
			}
			helper[i].comparedvalue.add(helper[largerestlength-1-i].value);
		}
	}
	
	private void swap(Element [] helper, int a, int b){
		int temp = helper[a].value;
		helper[a].value = helper[b].value;
		helper[b].value = temp;
	}
	
	private int largest(List<Integer> list){
		int max = list.get(0);
		for (int num:list){
			max = Math.max(num, max);
		}
		return max;
	}
	
	static class Element{
		int value;
		List<Integer> comparedvalue;
		Element(int value){
			this.value = value;
			this.comparedvalue = new ArrayList<>();
		}
	}
}
