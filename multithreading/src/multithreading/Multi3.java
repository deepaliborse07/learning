package multithreading;

public class Multi3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("Thread is running");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi3 t=new Multi3();
		Thread t1=new Thread();
		t1.start();

	}

}
