package com.kh.step6;

public class MegaBoxUser implements Runnable {

	
		private boolean seat = false; // 좌석예매가 끝나면 true

		@Override
		public void run() {
			// 예매하는 기능 
			try {	
				reserve();
			}catch (InterruptedException e) {	
			       e.printStackTrace();
			 }
			}
		// 어제 수업중에 빠진것 다시 적기

		public synchronized void reserve() throws InterruptedException {
			String name = Thread.currentThread().getName();
			System.out.println(name + " 님, 예매하러 오셨습니다!!");
				
			if(seat == false) {
				   Thread.sleep(2000);
				   System.out.println(name + " 님, 좌석 예매 성공하셨습니다");
				   seat = true;
				}else {
					System.out.println(name + " 님, 해당 좌석은 이미 완료 된 좌석입니다");
				}
			}

}
