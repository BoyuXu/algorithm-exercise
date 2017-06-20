//Define class of entry
public class Entry<K,V> {
	final K key;
	V value;
	Entry<K,V> next;
	Entry(K key, V value){
		this.key = key;
		this.value = value;
	}
	public K getKey(){
		return key;
	}
	public V getValue(){
		return value;
	}
	public void setValue(V value){
		this.value = value;
	}
	//maintain array of entries
	//step1 hashkey to get hash
	Entry<K,V>[] array;
	private int hash(K key){
		if(key == null){
			return 0;
		}
		int hashNumber = key.hashCode();
		return hashNumber;
	}
	//form the hash map to entry index
	int getIndex(int hashNumber){
		return hashNumber % array.length;
		}
}
	//ietrate the whole list to find if the key is the same
	//Entry<K,V> cur = array[index];
	//while(cur != null){
		//K curkey = cur.getKey();
		//if(){}
		//cur = cur.next;
	//}

