package bitoperation;

public class allunique2 {
	public boolean allUnique(String word) {
		int map[] = new int[8];
		char [] array = word.toCharArray();
		for(int i = 0; i < word.length(); i++){
			if((map[array[i] / 32] >>> (array[i] % 32) & 1) != 0){
				return false;
			}else {
				map[array[i]/32] |= 1 << (array[i] % 32);
			}
		}
		return true;
	}
}
