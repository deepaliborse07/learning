package multithreading;

public class TestMultiNaming2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultiNaming2 t=new TestMultiNaming2();
		TestMultiNaming2 t1=new TestMultiNaming2();
		
		t.start();
		t1.start();

	}

}
