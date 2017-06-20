package queuebyarray;

public class queue {
	int head;
	int tail;
	int size;
	Integer [] array;
	public queue(int cap){
		array = new Integer[cap];
		head = tail = 0;
		size = 0;
	}
	
	public boolean offer(Integer ele){
		if(size == array.length){
			return false;
		}
		array[tail] = ele;
		tail = tail + 1;
		size ++;
		return true;
	}
	
	public Integer peek(){
		if (size == 0){
			return null;
		}
		return array[head];
	}
	
	public Integer poll(){
		if(size == 0){
			return null;
		}
		Integer result = array[head];
		head = head + 1 == array.length ? 0 : head + 1;
		return result;
	}
}
