package multiplethreads;

import java.util.Random;

public class Main1 {
	private Metrics metrics;
	

	
	public static void main(String[] args) {
		Metrics metrics=new Metrics();
		

		BusinessLogic businessLogicThread1=new BusinessLogic(metrics);
		
		BusinessLogic businessLogicThread2=new BusinessLogic(metrics);
		
		MetricsPrinter metricsprinter=new MetricsPrinter(metrics);
		
		businessLogicThread1.start();
		businessLogicThread2.start();
		metricsprinter.start();
		
	}
	public static class MetricsPrinter extends Thread{
		private Metrics metrics;

		public MetricsPrinter(Metrics metrics) {
			super();
			this.metrics = metrics;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e) {
					
				}
				
				double currentAverage=metrics.getAverage();
				
				System.out.println("Current Average is"+ currentAverage);
			}
		}
	}
	public static class BusinessLogic extends Thread{
		private Metrics metrics;
		private Random random=new Random();
		
		public BusinessLogic(Metrics metrics) {
			
			this.metrics = metrics;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
			long start=System.currentTimeMillis();
			
			try {
			Thread.sleep(random.nextInt(10));
			}
			catch(InterruptedException e){
				
			}
			long end=System.currentTimeMillis();
			
			metrics.addSample(end-start);
		}
		}
	}

 public static class Metrics{
	 
	 private long count=0;
	 private volatile double average=0.0;
	 
	 public synchronized void addSample(long sample) {
		 double currentSum=average*count;
		 count++;
		 average=(currentSum+sample)/count;
	 }
	 
	 public double getAverage() {
		 return average;
	 }
 }

}