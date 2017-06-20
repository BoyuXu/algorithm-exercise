package generic;
import java.util.*;

public class ProducerConsumer {
	public static void main(String [] args) {
		Q q = new Q(100);
		List<Thread> threads = new ArrayList<>();
		for (int i = 0 ; i < 100; i++) {
			threads.add(new Thread(new Producer(q)));
		}
		for (int i = 0 ; i < 100; i++) {
			threads.add(new Thread(new Consumer(q)));
		}
		for (Thread t : threads) {
			t.start();
		}
	}
}
