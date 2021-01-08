package practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GFG1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		//creating the object of the
		//executor service interface
		ExecutorService executorService=Executors.newFixedThreadPool(50);
		
		//submit() method can return the
		//result of the computation
		//because it has a return type of future
		
		//by using submit we are 
		//accepting a callable task
		
		Future obj=executorService.submit(new Callable() {

			@Override
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("This is the submit()"+" method example");
				return "Returning callable"+"Task Result";
			}
			
			
		});
		
		//This method will return the result
		//if the task has finished perfectly
		//the submit() method returns a
		//java future object which is 
		//used to check when the runnabe
		//has completed
		//As it implements Future
		//get() method is called 
		//to get the result
		
		System.out.println(obj.get());
	}

}
