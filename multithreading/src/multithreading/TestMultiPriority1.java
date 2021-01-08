package multithreading;

public class TestMultiPriority1 extends Thread {

	@Override
	public void run() {
	// TODO Auto-generated method stub
	System.out.println("running thread name is"+Thread.currentThread().getName());

	System.out.println("running thread priority"+Thread.currentThread().getPriority());
	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultiPriority1 t=new TestMultiPriority1();
		TestMultiPriority1 t1=new TestMultiPriority1();
		
		t.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);

		

	}

}
