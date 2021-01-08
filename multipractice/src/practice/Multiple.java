package practice;

public class Multiple extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("hi deepali");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m=new Multiple();
		m.start();

	}

}
