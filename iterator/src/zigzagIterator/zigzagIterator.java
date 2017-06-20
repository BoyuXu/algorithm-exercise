package zigzagIterator;

import java.util.*;

public class zigzagIterator {
	int pos;
	List<Iterator> list = null;
	int count;
	Integer nextItem = null;
	
	public zigzagIterator(List<Iterator> it){
		this.list = it;
		pos = 0;
		count = 0;
	}
	
	public boolean hasNext() {
		return false;
	}
	
	public int next() throws Exception{
		if (this.hasNext()) {
			Integer result = nextItem;
			nextItem = null;
			return result;
		}
		throw new Exception();
	}
	
	
}
