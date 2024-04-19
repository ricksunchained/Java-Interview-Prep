package com.demo;

public class MyThread  extends Thread{

	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("MyThread called");	
		}
		
	}
	public static void main(String[] args) {
		MyThread o= new MyThread();
		o.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread called");	
		}

	}

}
