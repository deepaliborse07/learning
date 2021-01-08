package practice;

public class Multi extends Thread{
	
	public void run() {
		System.out.println("hi Deepali");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi t1=new Multi();
		t1.start();
	}

}
