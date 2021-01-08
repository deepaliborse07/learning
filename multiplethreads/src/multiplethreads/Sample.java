package multiplethreads;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
				System.out.println("current thread priority is"+ Thread.currentThread().getPriority());
				
			}
		});
		thread.setName("New Worker Thread");
		
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("We are in thread:"+Thread.currentThread().getName()+ "before starting a thread");
		thread.start();
		System.out.println("We are in thread:"+Thread.currentThread().getName()+ "after starting a thread");

	}

}
