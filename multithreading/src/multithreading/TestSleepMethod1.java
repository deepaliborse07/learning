package multithreading;

public class TestSleepMethod1 extends Thread {
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
		TestSleepMethod1 t1=new TestSleepMethod1();
		TestSleepMethod1 t2=new TestSleepMethod1();
		t1.start();
		t2.start();
	}

}
