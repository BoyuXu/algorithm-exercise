package arrayiterator;

public class arrayiterator {
	private int index;
	private int [] arr;
	public arrayiterator(int [] array) throws Exception{
		// TODO Auto-generated constructor stub
		index = 0;
		arr = array;
	}
	public boolean hasNext() {
		if (index < arr.length) {
			return true;
		}
		return false;
	}
	public int next() throws Exception{
		if (hasNext()){
			return arr[index++];
		}
		throw new Exception("no values remains");
	}
}
