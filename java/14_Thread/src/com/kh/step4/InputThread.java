package com.kh.step4;

public class InputThread extends Thread {
 
	public void run() {
		for(int i=10; i>0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
}
