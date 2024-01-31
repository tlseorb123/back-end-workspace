package com.kh.step3;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
        
	BeepThread beep =new BeepThread();
	beep.start();
		
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
			
	}
	
}
