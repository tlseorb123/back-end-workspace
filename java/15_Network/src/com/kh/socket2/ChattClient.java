package com.kh.socket2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

// 키보드로 입력받은 데이터를 읽어서 서버로 보낸다 
// 다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력한다.

/*
 * 클라이언트측 로직
 * 1. 소켓 생성 
 * 2. 스트림 
 * BufferedReader, InputStreamReader, System.in
 * PrintWriter <- s.getOutputStream
 * 
 * BufferedReader, InputStreamReader <- s.getInputStream
 * */
public class ChattClient {

	public static void main(String[] args) {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			
			Socket s = new Socket(ip, 60000);
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
						
			while(true) {
			  String line = br.readLine();
			  pw.println(line);
			  
			  String serverMsg = br2.readLine();
			  System.out.println("내가 보낸 메세지 : " + serverMsg);
			}
			
				
			
		}catch(Exception e) {
			
		}
	}
}
