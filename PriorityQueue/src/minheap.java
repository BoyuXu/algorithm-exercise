import java.util.Collections;

public class minheap {
	private int [] array;
	private int size;
	public minheap(int []array){
		if(array == null || array.length == 0){
			throw new IllegalArgumentException();	
		}
		this.array = array;
		size = array.length;
		heapify();
	}
	//heapify 建议用percolatedown
	private void heapify(){
		for(int i = size/2 - 1; i >= 0; i--){
			percolateDown(i);
		}
	}
	
	private void percolateDown(int index){
		while(index < size/2 - 1){
			int left = 2 * index + 1;
			int right = 2 * index + 2;
			int swapCandidate = left;
			// if right exists
			if(right <= size && array[right] < array[index]){
				swapCandidate = right;
			}
			if(array[left] < array[index]){
				swap(array, swapCandidate, index);
			}
			else{
				break;
			}
		index = swapCandidate;
		}
	}
	
	private void percolateUp(int index){
		while(index > 0){
			int parent = (index - 1) / 2;
			if(array[parent] > array[index]){
				swap(array, parent, index);
			}
			else{
				break;
			}
			index = parent;
		}
	}
	
	 private void swap(int [] array, int a, int b){
		 int temp = array[a];
		 array[a] = array[b];
		 array[b] = temp;
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
	 
	 public int peek(){
		 if(array.length == 0){
			 return -1;
		 }
		 return array[0];
	 }
	 
	 public int poll(){
		if(array.length == 0){
			return -1;
		} 
		int result = array[0];
		array[0] = array[size - 1];
		size --;
		percolateDown(0);
		return result;
	 }
	 
	 public void offer(int value){
		 // 需要延长数组
		 if(size == array.length){
			 int [] newarray = new int [(int) (array.length*1.5)];
			 for(int i = 0; i < array.length; i++){
				 array[i] = newarray[i];
			 }
			 array = newarray;
		 }
		 array[size] = value;
		 size++;
		 percolateUp(size-1);
	 }
	 
	 public int update(int index, int ele){
		 if(index < 0 || index > size-1){
			 throw new ArrayIndexOutOfBoundsException();
		 }
		 int result = array[index];
		 array[index] = ele;
		 if(ele > result){
			 percolateDown(index);
		 }
		 else{
		 percolateUp(index);
		 }
		 return result;
	 }
}
