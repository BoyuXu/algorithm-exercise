package generic;
import java.util.*;

public class Q {
	private Queue<Integer> q;
	private final int limit;
	public Q (int limit) {
		this.q = new LinkedList<>();
		this.limit = limit;
	}
	public void Q () {
		
	}
	
	public synchronized void put(Integer ele) throws InterruptedException {
		while (q.size() == limit) {
			wait();
		}
		if (q.size() == 0) {
			notifyAll();
		}
		q.offer(ele);
	}
	
	public synchronized Integer take() throws InterruptedException {
		while (q.size() == 0) {
			wait();
		}
		if (q.size() == limit) {
			notifyAll();
		}
		return q.poll();
	}
}
