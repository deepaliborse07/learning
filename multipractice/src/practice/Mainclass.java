package practice;

class Threadon implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		System.out.println("Thread one started");
	
	
}
}
class Threadtwo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		System.out.println("thread two started");
		
	}
	
}
class Threadthree implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		System.out.println("Thread three started");
	}
	
}
class Threadfour implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		System.out.println("Thread four started");
	}
	
}
class Threadfive implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		System.out.println("thread five started");
	}
	
}
public class Mainclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//int n=10;

		Threadon on=new Threadon();
		Thread t=new Thread(on);
		t.start();
		t.sleep(500);
		
		Threadtwo two=new Threadtwo();
		Thread t1=new Thread(two);
		t1.start();
		
		
		Threadthree three=new Threadthree();
		Thread t2=new Thread(three);
		t2.start();
		
		Threadfour four=new Threadfour();
		Thread t3=new Thread(four);
		t3.start();
		
		Threadfive five=new Threadfive();
		Thread t4=new Thread(five);
		t4.start();
		
		
	}

}
