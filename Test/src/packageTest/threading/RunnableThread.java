package packageTest.threading;

public class RunnableThread implements Runnable{
	public void run() {
		System.out.println("Thread is running....");
	}

	public static void main(String [] args) {
		Thread T = new Thread(new RunnableThread());
		T.start();
		System.out.println("Thread came here-------");
	}
}
