package generalPractice;

public class MyThread extends Thread{

	public void run()
	{
		for(int i=0;i<2;i++) {
		Thread.yield();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("this the run method of thread");
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
	  MyThread t= new MyThread();
	  t.start();
	  for(int i=0;i<3;i++)
		{
		  Thread.sleep(5000);
			System.out.println("this is the non yield method 1");
		}
	
	}
}
