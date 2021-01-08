package multithreading;

public class TestThreadTwice1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadTwice1 t=new TestThreadTwice1();
		
		t.start();
		t.start();
		
	}

}
