import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class maxheap {
	public int [] array;
	public int size;
	public maxheap(int [] array){
		if(array == null || array.length == 0){
			throw new IllegalArgumentException("can't");
		}
		this.array = array;
		size = array.length;
		heapify();
	}
	
	private void heapify(){
		for(int i = (size - 1) / 2; i > 0; i--){
			percolateDown(i);
		}
	}
	
	public maxheap(int cap){
		if(cap <= 0){
			throw new IllegalArgumentException("cant"); 
		}
		array = new int [cap];
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public boolean isFull(){
		return size == array.length;
	}
	
	private void percolateUp(int index){
		while(index > 0){
			int parent = (index - 1) / 2;
			if(array[index] > array[parent]){
				swap(array, index, parent);
			}
			else{
				break;
			}
			index = parent;
		}
	}
	
	private void percolateDown(int index){
		while(index < (size - 2) / 2){
			int left = index * 2 + 1;
			int right = index * 2 + 2;
			int larger = left;
			if(right <= size - 1 && array[right] > array[left]){
				larger = right;
			}
			//int larger = array[left] > array[right]? left : right;
			if(array[larger] > array[index]){
				swap(array, left, right);
			}
			else{
				break;
			}
			index = larger;
		}
	}
	
	public int peek(){
		if(size == 0){
			return -1;
		}
		return array[0];
	}
	
	public int poll(){
		if(size == 0){
			throw new NoSuchElementException("empty");
		}
		int result = array[0];
		array[0] = array[size - 1];
		size --;
		percolateDown(0);
		return result;
	}
	
	public void offer(int i){
		if(size == array.length){
			int [] newarray = new int[(int)(array.length * 1.5)];
			for(int j = 0; j < array.length; j++){
				newarray[j] = array[j];
			}
			array = newarray;
		}
		size ++;
		array[size - 1] = i;
		percolateUp(size - 1);
	}
	
	public int update(int index,int ele){
		if(index < 0 || index > size - 1){
			throw new ArrayIndexOutOfBoundsException("out");
		}
		int result = array[index];
		array[index] = ele;
		if(ele > result){
			percolateUp(index);
		}
		else{
			percolateDown(index);
		}
		return result;
	}
	
	private void swap(int [] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
