package multithreading;

public class TestCallRun2 extends Thread {

	@Override
	public void run() {
	// TODO Auto-generated method stub
	for(int i=1;i<5;i++) {
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestCallRun2 t=new TestCallRun2();
		t.run();
	}

}
