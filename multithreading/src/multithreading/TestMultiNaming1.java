package multithreading;

public class TestMultiNaming1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultiNaming1 t=new TestMultiNaming1();
		TestMultiNaming1 t1=new TestMultiNaming1();
		
		System.out.println("Name of t1:"+t.getName());
		System.out.println("Name of t:"+t1.getName());
		
		t1.start();
		t.start();
		
		t.setName("Sonoo jaiswal");
		System.out.println("After changing name of t:"+t.getName());

	}

}
