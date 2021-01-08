/*by using thread.interrupt interrupted ecception is thrown*/
package multiplethreads;

public class Interrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(new BlockingTask());
		
		thread.start();
		thread.interrupt();

	}
	private static class BlockingTask implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep( 10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Exiting blocking thread");
			}
		}
		
	}

}
