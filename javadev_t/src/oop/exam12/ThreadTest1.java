package oop.exam12;

import oop.exam11.ClassA;

public class ThreadTest1 extends ClassA implements Runnable {
	public static void main(String[] args) {
		ThreadTest1 t = new ThreadTest1();
		Thread nt = new Thread(t);
		nt.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println(i + ":main()");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main() 종료");
		
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i + ":run()");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("run() 종료");
	}
}
