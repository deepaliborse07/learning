package multithreading;

public class TestCallRun1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCallRun1 t=new TestCallRun1();
		t.run();

	}

}
