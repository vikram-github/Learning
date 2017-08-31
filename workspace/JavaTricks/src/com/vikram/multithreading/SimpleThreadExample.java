package com.vikram.multithreading;

public class SimpleThreadExample {
	
	class MyThread extends Thread {
		@Override
		public void run() {
			System.out.println("Child Thread Executing" + getName());
		}
	}

	public static void main(String[] args) {
		MyThread t = new SimpleThreadExample().new MyThread();
		t.setName("t");
		t.start();
		
		MyThread t1 = new SimpleThreadExample().new MyThread();
		t1.setName("t1");
		t1.start();
		
	}
}
