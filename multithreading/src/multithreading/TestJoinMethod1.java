package multithreading;

public class TestJoinMethod1 extends Thread {

	@Override
	public void run() {
	// TODO Auto-generated method stub
	for(int i=1;i<=5;i++) {
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJoinMethod1 t=new TestJoinMethod1();
		TestJoinMethod1 t1=new TestJoinMethod1();
		t.start();
		try {
			t.join();
		}
		catch(Exception e) {
			t.start();
			t1.start();
		}

	}

}
