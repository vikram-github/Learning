package com.vikram.multithreading;

public class SimpleRunnableThread {

	class RunnableThread implements Runnable {
		@Override
		public void run() {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		Thread myThread = new Thread(new SimpleRunnableThread().new RunnableThread());
		myThread.start();
	}
}
