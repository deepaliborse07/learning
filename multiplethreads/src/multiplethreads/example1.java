package multiplethreads;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new NewThread();
	
		thread.start();

	}

	private static class NewThread extends Thread{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Hello from"+this.getName()
			);	
		}
	}
}
