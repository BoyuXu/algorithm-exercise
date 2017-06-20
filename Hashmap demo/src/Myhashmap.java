public class Myhashmap<K,V> {
	public static class Node<K,V>{
		final K key;
		V value;
		Node <K,V> next;
		Node(K key,V value){
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
	}
	//rehash
	public static final int DEFAULT_CAPACITY = 16;
	public static final float DEFAULT_LOAD_FACTOR = 0.75F;
	private Node<K,V> [] array;
	private int size;
	private float loadFactor;
	
	public Myhashmap(){
		this(DEFAULT_CAPACITY,DEFAULT_LOAD_FACTOR);
	}
	
	public Myhashmap(int cap,float loadfactor){
		if(cap <= 0){
			throw new IllegalArgumentException("cannot be <= 0");
		}
			this.array = new Node[cap];
			this.size = 0;
			this.loadFactor = loadfactor;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isempty(){
		return size == 0;
	}
	
	private int hash(K key){
		// null key
		if(key == null){
			return 0;
		}
		// guarantee non-negative
		return key.hashCode() & 0X7FFFFFFF;
	}
	
	private int getIndex(K key){
		return hash(key) % array.length;
	}
	
	private boolean equalsValue(V v1, V v2){
		if(v1 == null && v2 == null){
			return true;
		}
		else if(v1 == null || v2 == null){
			return false;
		}
		return v1.equals(v2);
	}
	
	private boolean equalsKey(K k1, K k2){
		if(k1 == null && k2 == null){
			return true;
		}
		else if(k1 == null || k2 == null){
			return false;
		}
		return k1.equals(k2);
	}
	
	public boolean containsValue(V value){
		if(isempty()){
			return false;
		}
		for(Node <K,V> node:array){
			while(node != null){
				if(equalsValue(value, node.value)){
					return true;
				}
				node = node.next;
			}
		}
		return false;
	}
	
	public boolean containskey(K key){
		int index = getIndex(key);
		Node <K,V> node = array[index];
		while(node != null){
			if(equalsKey(key, node.key)){
				return true;
			}
			node = node.next;
		}
		return false;
	}
	
	public V get(K key){
		int index = getIndex(key);
		Node <K,V> node = array[index];
		while(node != null){
			if(equalsKey(key, node.key)){
				return node.value;
			}
			node = node.next;
		}
		return null;
	}
	// put denotes the insert of linkedlist, with an oputup element
	public V put(K key, V value){
		int index = getIndex(key);
		Node <K,V> head = array[index];
		Node <K,V> node = head;
		// condition one: key is already existed
		while(node != null){
			if(equalsKey(key, node.key)){
				V result = node.value;
				node.value = value;
				return result;
			}
			node = node.next;
		}
		//condition two: no key, insert in the head 
		Node <K,V> newNode = new Node(key, value);
		newNode.next = head;
		array[index] = newNode;
		size++;
		if(needrehashing()){
			//rehashing();
		}
		return null;
	}
	
	private boolean needrehashing(){
		float ratio = (size + 0.0f)/array.length;
		return ratio >= loadFactor;
	}

}
