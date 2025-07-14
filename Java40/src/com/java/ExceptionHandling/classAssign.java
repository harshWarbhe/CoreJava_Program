package com.java.ExceptionHandling;

class thread1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child Thread is running");
	}
}

public class classAssign {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("main thread started...");
		
		thread1 t1 = new thread1();
		
		t1.start();
		
		t1.sleep(1000, 10000);
		
		System.out.println("main thread ended....");
	}

}
