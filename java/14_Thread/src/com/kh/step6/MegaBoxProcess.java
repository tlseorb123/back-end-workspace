package com.kh.step6;

// MegaBox에서 좌석을 예매하는 일을 전담하는 쓰레드라고 간주
public class MegaBoxProcess {
	
 public static void main(String[]args) {
	 
	
	MegaBoxUser user = new MegaBoxUser();
	
	Thread t1 = new Thread(user, "윤민영");
	Thread t2 = new Thread(user, "정회영");
	
	t1.start();
	t2.start();
}		
}

