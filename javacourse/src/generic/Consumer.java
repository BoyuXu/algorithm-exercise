package generic;

public class Consumer implements Runnable{
	Q q;
	public Consumer(Q q) {
		super();
		this.q = q;
	}
	@Override
	public void run() {
		try {
			System.out.println(q.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}