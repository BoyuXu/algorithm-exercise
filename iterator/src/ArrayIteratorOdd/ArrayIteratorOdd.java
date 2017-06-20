package ArrayIteratorOdd;

public class ArrayIteratorOdd {
	int index;
	int [] arr;
	int length;
	public ArrayIteratorOdd(int [] array) throws Exception{
		index = 0;
		arr = array;
		length = array.length;
	}
	public boolean hasNext() {
		while (index < length) {
			if (arr[index] % 2 == 1) {
				return true;
			}
			index++;
		}
		return false;
	}
	public int next() throws Exception{
		if (hasNext()) {
			int oddIndex = index;
			index++;
			return arr[oddIndex];
		}
		throw new Exception("no value remains");
	}


	public static void main (String [] args) {
		int [] array = {1,2,3,2,2}; 
		try {
			ArrayIteratorOdd a = new ArrayIteratorOdd(array);
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