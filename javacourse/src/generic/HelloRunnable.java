package generic;

public class HelloRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			if (Thread.interrupted()) {
				return;
			}
			
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
			System.out.println("hello");
		}
	}
	public static void main(String [] args) {
		Thread newThread = new Thread(new HelloRunnable());
		newThread.start();
		newThread.interrupt();
	}
}
