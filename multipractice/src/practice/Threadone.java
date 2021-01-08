//multithreading using runnable interface
package practice;

public class Threadone implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadone t1=new Threadone();
		Thread t= new Thread(t1);
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi deepali");
		
	}

}
