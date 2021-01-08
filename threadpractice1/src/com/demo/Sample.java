package com.demo;

public class Sample {

	public static void main(String[] args, int millis) throws InterruptedException {
		// TODO Auto-generated method stub
       Thread thread=new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("we are now in thread"+Thread.currentThread().getName());
		}
	});
       
       System.out.println("We are in thread:"+Thread.currentThread().getName()+"before starting a thread");
       thread.start();
       System.out.println("We are in thread:"+Thread.currentThread().getName()+"after starting a thread");
       //Thread.sleep( 1000);
     }

}
