package com.kh.step3;

import java.awt.Toolkit;

public class BeepPrintTest2 {

	public static void main(String[] args) {

		
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		// 경고음 5번 울리는 작업 
		for(int i=0; i<5; i++) {
			tool.beep();
			try {
				Thread.sleep(1000); // try catch로 바꾼다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 띵띵띵띵띵 5번 출력하는 작업 
		for(int i=0; i<5; i++) {
			System.out.println("띵~");
				tool.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
