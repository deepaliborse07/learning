//package practice;
//
//public class TestMultipleThread extends Thread {
//
//	public void run() {
//		for(int i=1;i<50;i++) {
//			try {
//				Thread.sleep(500);
//			}
//			catch(InterruptedException e){
//				e.printStackTrace();
//			}
//			System.out.println("Hello world"+i);
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TestMultipleThread t1= new TestMultipleThread();
//		t1.run();
//		
//		TestMultipleThread t2=new TestMultipleThread();
//		t2.start();
//		
//		TestMultipleThread t3=new TestMultipleThread();
//		t3.start();
//		
//		TestMultipleThread t4=new TestMultipleThread();
//		t4.start();
//		
//		TestMultipleThread t5=new TestMultipleThread();
//		t5.start();
//		
//	}
//
//}
