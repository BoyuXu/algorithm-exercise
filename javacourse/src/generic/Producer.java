package generic;

public class Producer implements Runnable{
	Q q;
	public Producer(Q q) {
		super();
		this.q = q;
	}
	@Override
	public void run() {
		try {
			q.put(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
