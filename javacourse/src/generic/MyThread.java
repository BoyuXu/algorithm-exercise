package generic;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("hello");
	}

	public static void main(String [] args) {
		Thread newThread = new MyThread();
		newThread.start();
	}
}
