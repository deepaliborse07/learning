//package pcdemo;
//
//import java.io.ObjectOutputStream.PutField;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Producer extends Thread {
//
//	private static final int MAX_SIZE=3;
//	private final List<String> messages=new ArrayList<>();
//	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		try {
//			while(true)
//			{
//				produce();
//			}
//		}catch(Exception e) {
//			
//		}
//	}
//
//	private synchronized void produce() throws InterruptedException {
//		// TODO Auto-generated method stub
//		while(messages.size()==MAX_SIZE) {
//			wait();
//		}
//		String data=LocalDateTime.now().toString();
//		messages.add(data);
//		System.out.println("Producer produced data");
//		notify();
//	}
//	
//	public synchronized String consume() throws InterruptedException {
//		notify();
//		while(messages.isEmpty()) {
//			wait();
//		}
//		String data=messages.get(0);
//		messages.remove(data);
//		return data;
//		
//	}
//	
//}
