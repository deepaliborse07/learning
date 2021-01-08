package multithreading;

public class Multi extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is runnning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi t1=new Multi();
		t1.start();

	}

}
