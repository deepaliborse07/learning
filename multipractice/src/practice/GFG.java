//java program to demonstrate the behavior of execute() method
package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GFG {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Creating the object of executor service
		ExecutorService executorService= Executors.newSingleThreadExecutor();
		
		//execute() method cannot 
		//return anything because its return type is void
		
		//by using execute(),we are
		//accepting a runnable task
		
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("this is execute()"+" method example");
			}
			
		});
		
		//this method performs all the 
		//previosly submitted tasks before submission
		
		executorService.shutdown();
	}

}
