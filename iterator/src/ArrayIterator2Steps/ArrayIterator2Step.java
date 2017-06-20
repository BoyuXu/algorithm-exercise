package ArrayIterator2Steps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import ArrayIteratorOdd.ArrayIteratorOdd;

public class ArrayIterator2Step {
	Iterator<Integer> it;
	Integer temp;
	public ArrayIterator2Step(Iterator<Integer> it) {
		this.it = it;
		temp = null;
	}
	
	public boolean hasNext() {
		if (temp != null) {
			return true;
		}
		for (int i = 0 ; i < 2; i++) {
			if (!it.hasNext()){
				return false;
			}
			temp = it.next();
		}
		return true;
	}
	
	public Integer next() throws Exception{
		if (this.hasNext()) {
			Integer res = temp;
			temp = null;
			return res;
		}
		throw new Exception();
	}
	
	public static void main (String [] args) {
		Integer [] array = {1,2,3,4,5};
		List<Integer> list = Arrays.asList(array);
		Iterator<Integer> it = list.iterator();
		try {
			ArrayIterator2Step a = new ArrayIterator2Step(it);
			while (a.hasNext()) {
				int b = a.next();
				System.out.println(b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
