package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println("ExecutorService");	
			}
			
		});
		
		executorService.shutdown();

	}

}
